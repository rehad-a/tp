package nustracker.ui;

import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import nustracker.commons.core.GuiSettings;
import nustracker.commons.core.LogsCenter;
import nustracker.logic.Logic;
import nustracker.logic.commands.CommandResult;
import nustracker.logic.commands.exceptions.CommandException;
import nustracker.logic.parser.exceptions.ParseException;

/**
 * The Main Window. Provides the basic application layout containing
 * the top bar and space where other JavaFX elements can be placed.
 */
public class MainWindow extends UiPart<Stage> {

    public enum CurrentlyShownList {
        STUDENTS_LIST,
        EVENTS_LIST
    }

    public static final double MIN_HEIGHT = 747.0;
    public static final double MIN_WIDTH = 976.0;
    private static final String FXML = "MainWindow.fxml";

    private final Logger logger = LogsCenter.getLogger(getClass());

    private final Stage primaryStage;
    private final Logic logic;
    private final ThemeApplier themeApplier;

    // Independent Ui parts residing in this Ui container
    private StudentListPanel studentListPanel;
    private EventListPanel eventListPanel;
    private ResultDisplay resultDisplay;
    private final HelpWindow helpWindow;
    private final SettingsWindow settingsWindow;

    @FXML
    private Button helpButton;
    @FXML
    private StackPane commandBoxPlaceholder;
    @FXML
    private StackPane listPanelPlaceholder;
    @FXML
    private HBox topContainer; //This space is for the nustracker logo, and the help and exit button
    @FXML
    private MenuItem helpMenuItem;
    @FXML
    private Button exitButton;
    @FXML
    private Button changeThemeButton;
    @FXML
    private Button eventsButton;
    @FXML
    private Button studentsButton;
    @FXML
    private Button settingsButton;
    @FXML
    private StackPane resultDisplayPlaceholder;
    @FXML
    private StackPane statusBarPlaceholder;

    private CurrentlyShownList currentlyShownList = CurrentlyShownList.STUDENTS_LIST;



    /**
     * Creates a {@code MainWindow} with the given {@code Stage} and {@code Logic}.
     */
    public MainWindow(Stage primaryStage, Logic logic) {
        super(FXML, primaryStage);

        // Set dependencies
        this.primaryStage = primaryStage;
        this.logic = logic;
        GuiSettings guiSettings = logic.getGuiSettings();

        helpWindow = new HelpWindow();
        settingsWindow = new SettingsWindow(guiSettings);
        themeApplier = new ThemeApplier(this, helpWindow, settingsWindow, guiSettings.getIsLightTheme());

        // Configure the UI
        setWindowSize(guiSettings);
        fillInnerParts(guiSettings);
        settingsWindow.setStudentListPanel(studentListPanel);
        themeApplier.applyOnStartUp();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    /**
     * Fills up all the placeholders of this window.
     */
    void fillInnerParts(GuiSettings guiSettings) {
        studentListPanel = new StudentListPanel(logic.getFilteredStudentList(), guiSettings.getGlowHexCode());
        listPanelPlaceholder.getChildren().add(studentListPanel.getRoot());
        listPanelPlaceholder.managedProperty().bind(listPanelPlaceholder.visibleProperty());

        eventListPanel = new EventListPanel(logic.getFilteredEventList());

        resultDisplay = new ResultDisplay();
        resultDisplayPlaceholder.getChildren().add(resultDisplay.getRoot());

        StatusBarFooter statusBarFooter = new StatusBarFooter(logic.getAddressBookFilePath());
        statusBarPlaceholder.getChildren().add(statusBarFooter.getRoot());

        CommandBox commandBox = new CommandBox(this::executeCommand);
        commandBoxPlaceholder.getChildren().add(commandBox.getRoot());
    }

    /**
     * Sets the default size based on {@code guiSettings}.
     */
    private void setWindowSize(GuiSettings guiSettings) {
        //Prevents user from setting height/width smaller than limits
        primaryStage.setMinHeight(MIN_HEIGHT);
        primaryStage.setMinWidth(MIN_WIDTH);

        //User defined height and width (if different)
        primaryStage.setHeight(guiSettings.getWindowHeight());
        primaryStage.setWidth(guiSettings.getWindowWidth());

        if (guiSettings.getWindowCoordinates() != null) {
            primaryStage.setX(guiSettings.getWindowCoordinates().getX());
            primaryStage.setY(guiSettings.getWindowCoordinates().getY());
        }
    }

    /**
     * Opens the settings window or focuses on it if it's already opened.
     */
    @FXML
    public void handleSettings() {
        if (!settingsWindow.isShowing()) {
            settingsWindow.show();
        } else {
            settingsWindow.focus();
        }
    }

    /**
     * Opens the help window or focuses on it if it's already opened.
     */
    @FXML
    public void handleHelp() {
        if (!helpWindow.isShowing()) {
            helpWindow.show();
        } else {
            helpWindow.focus();
        }
    }

    /**
     * Toggles the students list from GUI.
     * Required as model is inaccessible from MainWindow.java. Model filter needs to be reset.
     */
    @FXML
    public void toggleStudents() {
        try {
            executeCommand("students");
        } catch (CommandException | ParseException e) {
            // Exception should never be thrown
            assert false : "ensure command is \"students\"";
        }
    }

    /**
     * Toggles the students list.
     */
    @FXML
    public void handleStudents() {
        listPanelPlaceholder.getChildren().clear();
        listPanelPlaceholder.getChildren().add(studentListPanel.getRoot());

        currentlyShownList = CurrentlyShownList.STUDENTS_LIST;
    }

    /**
     * Toggles the events list from GUI.
     * Required as model is inaccessible from MainWindow.java. Model filter needs to be reset.
     */
    @FXML
    public void toggleEvents() {
        try {
            executeCommand("events");
        } catch (CommandException | ParseException e) {
            // Exception should never be thrown
            assert false : "ensure command is \"events\"";
        }
    }

    /**
     * Toggles the events list.
     */
    @FXML
    public void handleEvents() {
        listPanelPlaceholder.getChildren().clear();
        listPanelPlaceholder.getChildren().add(eventListPanel.getRoot());

        currentlyShownList = CurrentlyShownList.EVENTS_LIST;
    }

    /**
     * Closes the application.
     */
    @FXML
    private void handleExit() {
        boolean isLightTheme = themeApplier.isLightTheme();

        GuiSettings guiSettings = new GuiSettings(primaryStage.getWidth(), primaryStage.getHeight(),
                (int) primaryStage.getX(), (int) primaryStage.getY(), isLightTheme, settingsWindow.getGlowHexCode());
        logic.setGuiSettings(guiSettings);

        settingsWindow.hide();
        helpWindow.hide();
        primaryStage.hide();
    }

    /**
     * Refreshes the student panel
     */
    @FXML
    private void handleRefresh() {
        studentListPanel.refreshPanel();
    }

    /**
     * Changes the current theme of the application.
     *
     * @see ThemeApplier#switchTheme()
     */
    @FXML
    private void changeTheme() {
        themeApplier.switchTheme();
    }

    void show() {
        primaryStage.show();
    }

    /**
     * Executes the command and returns the result.
     *
     * @see nustracker.logic.Logic#execute(String, CurrentlyShownList)
     */
    private CommandResult executeCommand(String commandText) throws CommandException, ParseException {
        try {
            CommandResult commandResult = logic.execute(commandText, currentlyShownList);
            logger.info("Result: " + commandResult.getFeedbackToUser());
            resultDisplay.setFeedbackToUser(commandResult.getFeedbackToUser());

            if (commandResult.isShowHelp()) {
                handleHelp();
            }

            if (commandResult.isShowSettings()) {
                handleSettings();
            }

            if (commandResult.isExit()) {
                handleExit();
            }

            if (commandResult.isToggleStudents()) {
                handleStudents();
            }

            if (commandResult.isToggleTheme()) {
                changeTheme();
            }

            if (commandResult.isToggleRefresh()) {
                handleRefresh();
            }

            if (commandResult.isToggleEvents()) {
                handleEvents();
            }

            return commandResult;
        } catch (CommandException | ParseException e) {
            logger.info("Invalid command: " + commandText);
            resultDisplay.setFeedbackToUser(e.getMessage());
            throw e;
        }
    }

}

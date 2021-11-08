package nustracker.logic.parser;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_YEAR = new Prefix("y/");
    public static final Prefix PREFIX_MAJOR = new Prefix("m/");
    public static final Prefix PREFIX_STUDENTID = new Prefix("id/");
    public static final Prefix PREFIX_DATE = new Prefix("d/");
    public static final Prefix PREFIX_TIME = new Prefix("t/");
    public static final Prefix PREFIX_EVENT = new Prefix("ev/");
    public static final Prefix PREFIX_FILENAME = new Prefix("fn/");

    /**
     * Gets a list of all the valid prefixes for nustracker.
     *
     * @return the list of prefixes in an ArrayList.
     */
    public static ArrayList<Prefix> getAllValidPrefixes() {
        ArrayList<Prefix> allPrefixes = new ArrayList<>(
                Arrays.asList(PREFIX_NAME,
                        PREFIX_PHONE,
                        PREFIX_EMAIL,
                        PREFIX_YEAR,
                        PREFIX_MAJOR,
                        PREFIX_STUDENTID,
                        PREFIX_DATE,
                        PREFIX_TIME,
                        PREFIX_EVENT,
                        PREFIX_FILENAME)
        );

        return allPrefixes;
    }

}

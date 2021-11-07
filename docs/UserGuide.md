---
layout: page-noheader
title: User Guide
---

![user-guide](images/userguide.png)

--------------------------------------------------------------------------------------------------------------------
<h1 align="center">
    Manage students with ease.
</h1>
<div align="center">
No more sleepless nights deriving Excel formulas. nustracker does everything for you, preserving your energy—for a happier school life.
</div><br>
<p align="center">
  <img src="images/Ui.png" />
</p> 

<div style="page-break-after: always;"></div>
<h1 align="center">
    Track event attendance.
</h1>
<div align="center">
nustracker specializes in displaying event information, each complete with student attendance and even a blacklist feature. Clean, silky management is here.
</div><br>
<p align="center">
  <img src="images/user-guide/after-creating-event.png" />
</p> 

<div style="page-break-after: always;"></div>
<h1 align="center">
    Customize to your liking.
</h1>
<div align="center">
    We know you're tired of staring at grid boxes (because we are too). With nustracker, you can switch between a light and dark mode, and customize the profile picture glow. Customization has never been simpler.
</div><br>
<p align="center">
  <img src="images/Ui-dark.png" />
</p> 

<div style="page-break-after: always;"></div>
**nustracker** is a desktop application for NUS event directors and student leaders of student organizations in NUS School of Computing to manage students and events.

As an event director and student leader, you will be able to add students and events into **nustracker** and use it to keep track event attendance, blacklist students, etc. These are just _some_ of the features and there will be more to come in the future. **nustracker** is customized to your needs—simple, intuitive, and easy to pick up.

All these things can be done through a simple and intuitive Command Line Interface (CLI), whilst being complimented by a detailed and elegant interface. 

This document will guide you through on how to start using **nustracker**.

You might see text formatted within colored boxes, so here's a quick run-through what they mean:

<div markdown="span" class="alert alert-info"> :label: **Note:** These boxes will provide you with extra information that is good to know.
</div>

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
These boxes will give you tips on how to use the application better.
</div>

<div markdown="span" class="alert alert-danger">:exclamation: **Caution:**
These boxes warn you about important things! It is imperative that you read these, otherwise bad things might happen.
</div>

<h1 align="center"> Let's get started with nustracker!</h1><br>
<div style="page-break-after: always;"></div>
<h1> Table of contents </h1>
* Table of Contents
{:toc}

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>
## Getting Started

<div markdown="span" class="alert alert-danger">:exclamation: **Caution:** <br><br>

**For macOS users**: Please start the .jar file via the terminal (see: step 5 below). If you do not, the files may not be created due to 
current macOS security restrictions on file creation. <br><br>
**For Windows users**: It is also recommended that the .jar be started
via the terminal as well (but double-clicking should work fine).

</div>

<br> 

**You finally have your hands on nustracker. Great! Let's learn how to use it now.**<br>

1. Ensure you have `Java 11` or above installed in your Computer. 

2. Download the latest `nustracker.jar`, found under [Releases](https://github.com/AY2122S1-CS2103T-T11-1/tp/releases). 

3. Copy the `nustracker.jar` to the folder you want to use as the _containing folder_ for **nustracker**. We recommend something easy to type, like _myfolder_.

4. For Windows Users (**macOS user see Step 5**)
    1. Double-click the jar file.<br><br>

5. For Mac Users: 
   1. Open [Terminal](https://support.apple.com/en-sg/guide/terminal/apd5265185d-f365-44cb-8b09-71a064a42125/mac).
   2. Navigate to the home folder created in **Step 3** using the terminal. For example, if your folder was created in Desktop and is called **myfolder**,
      you would type `cd /Desktop/myfolder/` to move to that folder. For more information, check: [_Go to a folder by entering its pathname_.](https://support.apple.com/en-sg/guide/mac-help/mchlp1236/mac)
   3. Type the following command into the Terminal: `java -jar nustracker.jar`. 

6. You should see the following (minus the profile pictures): <br>
   ![Ui](images/Ui.png)


**nustracker** is now up and running on your system! To get started, we suggest this flow:
1. [General Layout](#general-layout)
2. [Basics of nustracker](#basics-of-nustracker)
3. [Commands](#commands-section)

_If you are an experienced CLI user, you can jump straight to the [Command Summary](#command-summary)._


Get ready for an unprecedented overhaul in student and event management using **nustracker**!

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

## Features

**nustracker** was designed to help the average overworked university student, who also has many important responsibilities outside the curriculum in clubs and societies—specifically **student and event management**.

### What can nustracker do?
1. **Keep track of students**

    **nustracker** displays all students currently associated with the organization neatly. The students have their details and a profile picture (optional) listed with them as well, allowing quick and convenient access to student particulars.


2. **Keep tracks of events and event _attendance_**

    **nustracker** can also display the events stored, their information, and the participants taking part in those events.


4. **Keep track of event blacklists**
    
    Events often have blacklists, which can also be managed using **nustracker**.


5. **Be customized to the user's liking**
    
    One of the key points of **nustracker** is its customization. For more information, see [Customization](#customization).



--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>
## General Layout

The following is a description of the general layout of **nustracker**.

![general-layout](images/user-guide/general-layout.png)

1. **Top bar**
 
    * **Refresh**<br>
        Refreshes the currently displayed students/events. Press this button when you add profile pictures.

    * **Toggle Theme**<br>
        Toggles the theme of **nustracker**, from Dark theme to Light theme, and vice versa.

    * **Settings**<br>
         Opens the Settings Window.
     
    * **Students**<br>
        Displays current students.

    * **Events**<br>
        Displays current events.

    * **Help**<br>
        Opens the Help window.

    * **Exit**<br>
      Exit **nustracker**.

2. **Command bar**

    This space is for you to type in your commands. For more information about commands, either check out 
    our step-by-step [guide](#basics-of-nustracker) or the [commands section](#commands-section).

4. **Result Display**

    The empty box directly below the command bar is the result display, where error/success messages are displayed.
 
5. **Students**
 
    The students, their information, and the events they are taking part in are displayed here.

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

## Basics of nustracker

<div markdown="span" class="alert alert-info"> :label:
The profile pictures shown here are provided with the .zip file! You can add them to the profile-pictures folder (see Customization for more information), or you can ignore them for now.
</div>

We hope you are excited to learn the basics of **nustracker**!
But, before we do anything, let’s set the premise. Imagine that you are the manpower executive of a newly-formed NUS society called the Imaginary Society (Very creative we know). 

It plans on holding a fair—appropriately titled the Imaginary Fair—on the 1st of December 2021, at 9am.

Here are the particulars of our first member and participant: <br><br>
**Name**: Sae Byeok <br> <img style="float: right;" height="140" width="140" alt="" src="images/user-guide/sae-byeok.gif"/>
**Phone number**: 87438007 <br>
**Major**: CS <br>
**Year**: 1 <br>
**Student ID**: e1111111 <br>
**Email**: saebyeok@example.com <br>
**Wants to join**: Imaginary Fair

### Adding your first student

Okay, now that we know who our first member is, let's add her as a student to **nustracker**.

To add her, we are going to use the `add` command, which follows the format:
` add n/STUDENT_NAME m/MAJOR id/STUDENT_ID y/YEAR p/PHONE e/EMAIL`

So, in the case of Sae Byeok, her fields would be:
- `STUDENT_NAME`: Sae Byeok
- `MAJOR`: CS
- `STUDENT_ID`: e1111111
- `YEAR`: 1
- `PHONE`: 87438007
- `EMAIL`: saebyeok@example.com

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
The fields do not have to be any specific order. For example, `MAJOR` can come before `STUDENT_NAME`.
</div>

Using the fields above, type this into the command box: `add n/Sae Byeok m/CS id/e1111111 y/1 p/87438007 e/saebyeok@example.com` and press **Enter**.

After entering the command and pressing **Enter**, scroll all the way down using the scrollbar on the right to view your newly added student!
**nustracker** should look like this: 

![added-first-student](images/user-guide/add-student-aft-press-enter.png)

Congratulations! You have just added your first student! Next, we will learn how to create an event and 
eventually, how to add Sae Byeok as a participant!

### Creating your first event

Let's create the event `Imaginary Fair` to contain information about the Fair that the Imaginary Society wants to organise.

To create this event, we are going to use the `create` command, which follows the format: `create n/EVENT_NAME d/EVENT_DATE t/EVENT_TIME`.

So, in the case of Imaginary Fair, the fields would be:
- `EVENT_NAME`: Imaginary Fair
- `EVENT_DATE (DD-MM-YYYY)`: 01-12-2021
- `EVENT_TIME (24 Hour Time)`: 0900

Using the fields above, type this into the command box: `create n/Imaginary Fair d/01-12-2021 t/0900` and press **Enter**.

Now lets view the newly created event! To make **nustracker** show the current list of events, either press the **Events** button in the top bar, or type `events` into the command box and press **Enter**.
(_If you are unsure about the buttons, refer [here](#general-layout)._) Then scroll down using the scrollbar on the right.

If done right, **nustracker** should look like this: 

![created-event](images/user-guide/after-creating-event.png)

Congratulations! You have now created an event in **nustracker** as well!

### Enrolling your first student into your first event

Previously, you had added Sae Byeok as a student, and created the _Imaginary Fair_ event. 
Let's enroll her into the _Imaginary Fair_ as a participant.

In order to do this, we will make use of the `enroll` command: `enroll id/STUDENT_ID ev/EVENT`.

So, in the case of Sae Byeok and the Imaginary Fair, it would be:
- `STUDENT_ID`: e1111111 
- `EVENT`: Imaginary Fair

Using the fields above, type this into the command box: `enroll id/e1111111 ev/Imaginary Fair` and press **Enter**.

If done correctly, this change should be reflected in both the Imaginary Fair's details and Sae Byeok's particulars.

![event-card](images/user-guide/imaginary-fair-event-card-after-enroll.png)
_Under Participants, there is a participant with the Student ID `e111111`, which corresponds to Sae Byeok_

To make **nustracker** go back to the students list, either press the **Students** button in the top bar, or type `students` into the command box and press **Enter**.

![student-card](images/user-guide/student-card-after-enroll.png)<br>
_Under Enrolled Events, we can see that Sae Byeok is enrolled in the Imaginary Fair_ <br>




**Congratulations!** You have reached the end of this very brief tutorial where you learnt how to add your first student, create your
first event, as well as enrolling students into an event! But remember, **nustracker** is much more powerful than this!

You can:
- Edit Sae Byeok's details
- Delete events
- Blacklist students
- Export the emails of a list of students
- Add profile pictures
- And much _much_ more!

For a more comprehensive list of commands, please refer to the sections below or take a look at the [Command summary](#command-summary).

You're on your way to becoming an **nustracker** pro!

----------
<div style="page-break-after: always;"></div>
## Commands Section

<div markdown="block" class="alert alert-info">

**:label: Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/NAME`, `NAME` is a parameter which can be used as `add n/John Doe`.

* Items in square brackets are optional.<br>
  e.g. `n/NAME [m/MAJOR]` can be used as `n/John Doe m/CS` or as `n/John Doe`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  e.g. `[y/YEAR]…​` can be used as ` ` (i.e. 0 times), `y/1`, `y/ 1 2 3` etc.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/NAME p/PHONE`, `p/PHONE n/NAME` is also acceptable.

* If a parameter is expected only once in the command, but you specified it multiple times, only the last occurrence of the parameter will be taken.<br>
  e.g. if you specify `p/12341234 p/56785678`, only `p/56785678` will be taken.

* Extraneous parameters for commands that do not take in parameters (such as `help`, `students`, `events`, and `exit`) will be ignored.<br>
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.

* Commands that take in parameters cannot contain extraneous prefixes nor slashes. This means none of the input parameters should contain any slashes, since slashes are used to identify prefixes.

* If a command is entered with the correct prefixes but multiple inputs to the prefixes are not accepted,
  the error message shown would be based on the leftmost invalid prefix parameter in the command's command format.

</div>

----------
<div style="page-break-after: always;"></div>
## Student Commands

1. [Adding a student](#adding-a-student-add)
2. [Listing all students](#listing-all-students-students)
3. [Editing a student](#editing-a-student--edit)
4. [Deleting a student](#deleting-a-student--delete)
5. [Filtering students](#filtering-students-filter)
6. [Delete shown students](#delete-shown-students--delfiltered)
7. [Blacklisting students](#blacklisting-students-blacklist)
8. [Whitelisting students](#whitelisting-students-whitelist)

### Adding a student: `add`

Adds a student to **nustracker**

Command: `add n/STUDENT_NAME m/MAJOR id/STUDENT_ID y/YEAR p/PHONE e/EMAIL`

Formatting:

- Student name:
  - Does not need to be unique.
  - Can only contain alphanumerical characters and spaces.

- Major is to be specified via acronyms. The following acronyms are valid:
  1. CS (Computer Science)
  2. BZA (Business Analytics)
  3. IS (Information Systems)
  4. ISEC (Information Security)

- Student ID:
  - Must be specified exactly as the letter e, followed by 7 numbers. (eXXXXXXX)
  - Must be unique

- Year must be a number from 1 to 6 inclusive.
- Phone:
  - Must be unique
  - Have length of 3 - 20 numbers inclusive
- Email:
  - Must be unique
  - Must be in the `local-part@domain` format
  - `local-part`:
    - Should only contain alphanumeric characters and these special characters: `+ _ . -`
    - The special characters cannot be used consecutively
    - Cannot be blank
  - `domain`:
    - Made up of domain labels separated by periods 
    - Must end with a domain label at least 2 characters long
    - Starts and ends with alphanumeric characters
    - Consists of alphanumeric characters, separated only by hyphens, if any
  - Examples of valid emails:
    - `PeterJack_1190@example.com`
    - `a@bc`
    - `peter_jack@very-very-very-long-example.com`
    - `if.you.dream.it_you.can.do.it@example.com`
    - `a1+be.d@example1.com`

Examples:
* `add n/John Doe m/CS id/e7474831 y/2 p/81631293 e/JohnDoe99@example.com`
* `add n/Melissa Chong m/ISEC id/e3434827 y/5 p/90025837 e/MelissaChongxx@example.com`

### Listing all students: `students`

Shows all students in **nustracker**.

This command essentially removes any filters that have been applied with the `filter` command.

This command has the same function as clicking the **_students_** button in the top bar.

Command: `students`

### Editing a student : `edit`

Edits an existing student in **nustracker**.

Command: `edit id/ID_OF_STUDENT_TO_EDIT [n/NEW_NAME] [m/NEW_MAJOR] [id/NEW_STUDENT_ID] [y/NEW_YEAR] [p/NEW_PHONE] [e/NEW_EMAIL]`

* Edits the student who currently has the specified student ID.
* **At least one of the optional fields** must be provided.
* Existing values will be updated to the input values.
* Events of a student cannot be directly edited with the `edit` command, please make use of the `enroll` and `remove` commands for this purpose.

Examples:
* `edit id/e0322322 p/91234567 e/johndoe@example.com` edits the phone number and email of the student with student ID `e0322322` to be `91234567` and `johndoe@example.com` respectively.
* `edit id/e0542341 n/Betsy Crower id/e0543212` edits the name and student ID of the student with student ID `e0542341` to be `Betsy Crower` and `e0543212` respectively.
 
### Deleting a student : `delete`

Deletes the specified student from **nustracker**.

Command: `delete id/STUDENT_ID`

* Deletes the student with the specified `STUDENT_ID`.

Examples:
* `delete id/e1234567` deletes the student with the student ID `e1234567`.
* `delete id/e0589162` deletes the student with the student ID `e0589162`.

<div markdown="span" class="alert alert-info">

:label: **Note:** The command for deleting students and events are both `delete`.<br>
However, `delete` will delete either a student or an event and **cannot contain both student and event prefixes at once**.<br>
i.e. `delete id/STUDENT_ID ev/EVENT_NAME` is not allowed. (Refer to [Deleting an event](#deleting-an-event--delete) for more information.)

</div>

### Filtering students: `filter`

Filters students whose data contains the given field.

Command: `filter [id/STUDENT_ID [MORE_STUDENT_IDs]...] [n/STUDENT_NAME [MORE_STUDENT_NAMES]...] [m/MAJOR [MORE_MAJORS]...] [y/YEAR [MORE_YEARS]...] [ev/EVENT_NAME]`

* You can filter by:
    - Multiple student IDs.
    - Multiple student names.
    - Multiple majors.
    - Multiple years.
    - **A single** event name.

* This command can only be used when **nustracker** is showing the Student list.
* You can only filter by one field (i.e. filter only by student ID, student name, year, major, or event name).
* You have to filter by at least 1 parameter (simply typing `filter` will not work)
* The search is case-insensitive. e.g. `n/john` will match with `n/JOHN`.
* You can search using multiple keywords except for events.
* You can search by partial keywords for names. e.g. `n/al` will match with `n/alice`

Examples:
* `filter id/e1234567` returns the student with the ID e1234567 if that student exists in nustracker.
* `filter id/e1234567 e2345678` returns two students whose student IDs are e1234567 and e2345678 if they exist in nustracker.
* `filter n/John` returns the students whose names contain John.
* `filter n/John alice` returns the students whose names contain John OR Alice.
* `filter m/CS IS` returns the students majoring in CS or IS.
* `filter y/1 2 3` returns the students in years 1, 2, or 3.
* `filter ev/orientation` returns a list of students who are tagged to the Orientation event.

_**Coming soon:** Filter by phone number._

_**Coming soon:** Filter by multiple fields._

### Delete shown students : `delfiltered`

Mass deletes all students currently shown in the student list. This is typically used after a filter
command to delete students based on a certain criteria.

Command: `delfiltered`

<div markdown="span" class="alert alert-danger">:exclamation: **Caution:**
Use with caution! If the student list is not filtered before using `delfiltered`, all the students currently in **nustracker** will be deleted since all of them are shown.
</div>

* This command can only be used when **nustracker** is showing the Student list.
* After all the filtered students are deleted, the remaining students would then all be shown in the list, if any.
* At least one student needs to be shown in the filtered list for `delfiltered` to work.

Examples:
* `filter y/4` followed by `delfiltered` will delete all students who are in Year 4.
* `filter ev/Graduation 2021` followed by `delfiltered` will delete all students that have attended the Graduation Ceremony in 2021.

### Blacklisting students: `blacklist`

Blacklists students from an event. Blacklisted Students will not be allowed to enroll into the events they are blacklisted from.

Command: `blacklist id/STUDENT_ID ev/EVENT_NAME`

* Student ID need not exist in the database.
* Event name has to exist in the database.
* Student ID cannot be enrolled in event.
  * Use the [remove](#removing-a-student-from-an-event--remove) command to un-enroll the student ID before running the `blacklist` command.

Examples:
* `blacklist id/e1234567 ev/Orientation Camp` blacklists the student ID e1234567 from the Orientation Camp event.
* `blacklist id/e0000000 ev/Sports Camp` blacklists the student ID e0000000 from the Sports Camp event.
 
### Whitelisting students: `whitelist`

Whitelists students from an event. Whitelisted students are removed from an event's blacklist.

Command: `whitelist id/STUDENT_ID ev/EVENT_NAME`

* Student ID needs to be in the event's blacklist.
* Event name has to exist in the database.

Examples:
* `whitelist id/e1234567 ev/Orientation Camp` removes the student ID e1234567 from the Orientation Camp event's blacklist.
* `whitelist id/e0000000 ev/Sports Camp` removes the student ID e0000000 from the Sports Camp event's blacklist.



--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>
## Event Commands

1. [Creating an event](#creating-an-event-create)
2. [Listing all events](#listing-all-events--events)
3. [Enrolling a student in an event](#enrolling-a-student-in-an-event--enroll)
4. [Removing a student from an event](#removing-a-student-from-an-event--remove)
5. [Deleting an event](#deleting-an-event--delete)

### Creating an event: `create`
Adds an event to **nustracker**

Command: `create n/EVENT_NAME d/EVENT_DATE t/EVENT_TIME`

- Event name cannot be empty.
- Event name cannot contain the slash character as slashes are used to identify prefixes.
- The event name you choose must be unqiue and not already exist in the events list.

- Event date has to be in the format `DD-MM-YYYY`.
    - DD represents the day (from 01-31 inclusive)
      - A day will not be accepted if the month does not contain it.
      - For example, February does not have a 29th day (unless it is a leap year) so `29-02-2021` will not be accepted.
    - MM represents the month (from 01-12 inclusive)
    - YYYY represents the year.

- Event time has to be in 24 hour time `HHMM`.
    - HH represents the hour (from 00-24 inclusive)
    - MM represents the minute (from 00-59 inclusive)
    - **Note:** if HH is `24`, MM has to be `00`. (i.e. `2400`)
    
Examples:
* `create n/Orientation Camp d/01-08-2022 t/1000` creates an event with the name Orientation Camp, date 01-08-2022 or 1 August 2022, and time 1000 hrs or 10:00 am.

### Listing all events : `events`

Shows all events in the app.

This command has the same function as clicking the **_events_** button in the top bar.

Format: `events`

### Enrolling a student in an event : `enroll`

Enrolls the specified student into the specified event.

Command: `enroll id/STUDENT_ID ev/EVENT`

* Enrolls the student specified by student ID into the event specified by its event name.
* Event name is case-insensitive.

Examples:
* `enroll id/e0544111 ev/CS1101S Mock PE` enrolls the specified student with student ID e0544111 into the event "CS1101S Mock PE".
* `enroll id/e0322322 ev/Orientation Camp` enrolls the specified student with student ID e0322322 into the event "Orientation Camp".

### Removing a student from an event : `remove`

Removes the specified student from the specified event.

Command: `remove id/STUDENT_ID ev/EVENT`

* Removes the student specified by student ID from the event specified by its event name.
* Event name is case-insensitive.

Examples:
* `remove id/e0986472 ev/Tea Making Workshop` removes the student with student ID e0986472 from the event "Tea Making Workshop".
* `remove id/e0264853 ev/Fun Run` removes the student with student ID e0264853 into the event "Fun Run".

### Deleting an event : `delete`

Deletes an event from **nustracker**.

Command: `delete ev/EVENT_NAME`

* Deletes the event with the specified `EVENT_NAME`.

Examples:
* `delete ev/Orientation` deletes the event with the name `Orientation`.
* `delete ev/Sports Camp` deletes the event with the name `Sports Camp`.



<div markdown="span" class="alert alert-info">

:label: **Note:** The command to delete both students and events are `delete`.<br>
However, `delete` will only delete either a student or an event and **cannot contain both student and event prefixes at once**.<br>
i.e. `delete id/STUDENT_ID ev/EVENT_NAME` is not allowed. (Refer to [Deleting a student](#deleting-a-student--delete) for more information.)

</div>

--------------------------------------------------------------------------------------------------------------------

<div style="page-break-after: always;"></div>
## Other Commands

1. [Viewing help](#viewing-help--help)
2. [Viewing the settings](#viewing-the-settings-settings)
3. [Exporting Emails](#exporting-emails--export)
4. [Refreshing the main window](#refreshing-the-main-window-refresh)
5. [Changing the theme](#changing-the-theme-theme)
6. [Exiting the program](#exiting-the-program--exit)

### Viewing help : `help`

Opens the Help window

This command has the same function as clicking the **_help_** button in the top bar.

Command: `help`

### Viewing the settings: `settings`

Opens the Settings window

This command has the same function as clicking the **_settings_** button in the top bar.

Command: `settings`

### Exporting Emails : `export`

Exports the emails of the students that are currently being displayed.

Command: `export fn/FILE_NAME`

- Filenames cannot contain these illegal characters:
`\ : * ? " < > | `
- Filenames cannot exceed 50 characters.

The file will be located in the `data` directory, which is where the app's save files are located.

If the events list is currently being shown, export will still function and will export the emails of the most recent student list.

<div markdown="span" class="alert alert-danger">

:exclamation: **Caution:**
If you are exporting with a filename that already exists, the file will be overwritten!

</div>

Examples:
* `export fn/StudentsAttendingOrientation`
* `export fn/AllStudents`

### Refreshing the main window: `refresh`

Refreshes the main window. Often used to update the main window after adding profile pictures, etc.

This command has the same function as clicking the **_refresh_** button in the top bar.

### Changing the theme: `theme`

Toggles the theme between Dark and Light theme.

This command has the same function as clicking the **_toggle theme_** button in the top bar.

### Exiting the program : `exit`

Exits the program.

This command has the same function as clicking the **_exit_** button in the top bar.

Command: `exit`

---------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>
## Customization

1. [Changing between Light/Dark theme](#changing-between-lightdark-theme)
2. [Setting a profile picture](#setting-a-profile-picture)
3. [Changing the glow of the profile picture](#changing-the-glow-of-the-profile-picture-border)

Another key feature of **nustracker** is its ability to be customized greatly. This section covers how **nustracker** can be
customized to your liking.

### Changing between Light/Dark Theme
**nustracker** has a light/dark theme. To toggle between the two, click the button (to the left of _**Settings**_) as shown in the image below and voila!
 
![change_theme](images/user-guide/change_theme.PNG)

### Setting a profile picture
**nustracker** has the ability to add a profile picture to a student. Follow the steps given to add a picture:

1. If you have not started **nustracker** before, run **nustracker** within a folder of your choice.

2. Once it runs, a folder called _**profile-pictures**_ is created within the folder that contains **nustracker**.

    ![profile-pictures-folder](images/user-guide/profile-pictures-folder.PNG)

    *The **profile-pictures** folder is highlighted in blue*

3. Open the _**profile-pictures**_ folder and add the image you want as a profile picture. The image must be either a **.png** or a **.jpg** image.

4. Rename the image to correspond to the **Student ID** of the student in **nustracker** that will use this profile picture.

    For example, let's say there is a student in **nustracker** with the Student ID **e1111111**.

   ![match-student-id](images/user-guide/match-student-id.PNG)
 
   ![changed-profile-picture](images/user-guide/changed-profile-picture.PNG)

      *The updated student card (belonging to student with Student ID **e1111111** in **nustracker**)*

5. The profile picture will update once you type `refresh` into the command box, click the Refresh button, or restart **nustracker**.

6. You're done!

  Although most image sizes will work perfectly fine, the best image sizes are 120px by 120px.

### Changing the glow of the profile picture border

**nustracker** allows you to change the color of the glow of the profile picture.

1. Open up the **Settings** window either by clicking the **Settings** button or by typing in `settings` into the command box.
 

2. Click the dropdown menu, and pick a color.

   ![pre-selected](images/user-guide/pre-selected.PNG)

    *You can choose one of the pre-selected colors.*
 
<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
Advanced users: You can manually input your own color hex code in preferences.json! (If it is invalid,
the glow will be the default pink!).
</div>


<div style="page-break-after: always;"></div>
### Customization FAQs
 
**Q**: I have added the image, but it does not appear. <br>

**A**: Please check if:  
* the image is either **.jpg** or **.png**. Other image types are NOT supported. 
* you have the correct name format used—refer to [Setting a profile picture](#setting-a-profile-picture) point 3 above. 
* the image size is too small or too large. Due to the limitations of JavaFX, extreme image sizes cannot be displayed (more than 10 mb). 

If you have exhausted all options, you can file a bug report on our [GitHub page](https://github.com/AY2122S1-CS2103T-T11-1/tp/issues).
<br>

You have now learnt to customize **nustracker** to its fullest. Go ahead and play around with the settings!
    

---------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>
## Misc
### Saving the data

**nustracker** data is saved in the hard disk automatically after executing any command that changes the data. There is no need to save manually.

The file is saved in a folder where you ran the application. If you ran the application in `C:\Users\JohnDoe`, the data file will be in `C:\Users\JohnDoe\data` and is named `addressbook.json`

<div markdown="span" class="alert alert-info">

:label: **Note:**
The folder `C:\Users\JohnDoe\data` is also where exported files are contained!

</div>

### Editing the data file

**nustracker** data is saved as a JSON file. Advanced users are welcome to update data directly by editing that data file.

<div markdown="span" class="alert alert-danger"> :exclamation: **Caution:**
Please edit carefully! **nustracker** will not be able to load your data if any errors are present. If you type a command while the application has no data, your own data will be overwritten. 
We recommend that you make a backup of your original data file first just in case.
</div>
--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>
## FAQ

**Q**: Is nustracker free?<br>
**A**: Yes! nustracker is completely free to use.

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous **nustracker** home folder.

**Q**: Is my data in **nustracker** secure?<br>
**A**: Yes! Your data is stored locally on your computer, so it cannot be stolen unless someone has physical access to your computer.

**Q**: Do I need an internet connection to use nustracker?<br>
**A**: No. An internet connection is not required. nustracker can work completely offline.

**Q**: Can I use nustracker on a mobile device?<br>
**A**: Unfortunately not. nustracker is designed to work best on a desktop / laptop with the ability to make full use of the command line interface.

**Q**: I noticed a bug in **nustracker**. How do I report it?<br>
**A**: We are committed to delivering well-made software and to achieve that, every single bug report counts. To submit a bug report, please visit the [issues](https://github.com/AY2122S1-CS2103T-T11-1/tp/issues) page. Thank you for contributing to **nustracker**!

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>
## Command summary

### Student Commands

**Command** | **Description** | **Example** |
----------------------------|------------------------------|-----------------------------------------------------
**[add](#adding-a-student-add)** | Adds a student | `add n/STUDENT_NAME m/MAJOR id/STUDENT_ID y/YEAR p/PHONE e/EMAIL` |
**[students](#listing-all-students-students)** | Lists all students | `students` |
**[edit](#editing-a-student--edit)** | Edits a student | `edit id/ID_OF_STUDENT_TO_EDIT [n/NEW_NAME] [m/NEW_MAJOR] [id/NEW_STUDENT_ID] [y/NEW_YEAR] [p/NEW_PHONE] [e/NEW_EMAIL]` |
**[delete](#deleting-a-student--delete)** | Deletes a student | `delete id/STUDENT_ID` |
**[filter](#filtering-students-filter)** | Filters by field  | `filter n/STUDENT_NAME [MORE_STUDENT_NAMES]...` <br> `filter id/STUDENT_ID [MORE_STUDENT_IDS]...` <br> `filter m/MAJOR [MORE_MAJORS]...` <br> `filter y/YEAR [MORE_YEARS]...` <br> `filter ev/EVENT_NAME` |
**[delfiltered](#delete-shown-students--delfiltered)** | Mass deletes shown students | `delfiltered` |
**[blacklist](#blacklisting-students-blacklist)** | Blacklists a student from attending an event | `blacklist id/STUDENT_ID ev/EVENT_NAME` |
**[whitelist](#whitelisting-students-whitelist)** | Whitelists a student from attending an event | `whitelist id/STUDENT_ID ev/EVENT_NAME` |


### Event Commands

**Command** | **Description** | **Example** |
----------------|-------------------------|-----------------|
**[create](#creating-an-event-create)**  | Creates an event | `create n/EVENT_NAME d/EVENT_DATE t/EVENT_TIME` _<br> Date format: DD-MM-YYYY <br> Time format: HHMM_ |
**[events](#listing-all-events--events)**  | Lists events | `events` |
**[enroll](#enrolling-a-student-in-an-event--enroll)**  | Adds a student to an event | `enroll id/STUDENT_ID ev/EVENT_NAME` |
**[remove](#removing-a-student-from-an-event--remove)**  | Removes a student from an event | `remove id/STUDENT_ID ev/EVENT_NAME` |
**[delete](#deleting-an-event--delete)**  | Deletes an event | `delete ev/EVENT_NAME` |

### Other Commands

**Command** | **Description** | **Example** |
----------------|-------------------------|-----------------|
**[help](#viewing-help--help)** | Opens the help window | `help` |
**[settings](#viewing-the-settings-settings)** | Opens the settings window | `settings`|
**[export](#exporting-emails--export)** | Exports the emails of the students that are currently displayed | `export fn/FILE_NAME` |
**[refresh](#refreshing-the-main-window-refresh)**| Refresh the main window | `refresh` |
**[theme](#changing-the-theme-theme)** | Toggles the current theme | `theme` |
**[exit](#exiting-the-program--exit)** | Exits the app | `exit` |


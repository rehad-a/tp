---
layout: page
title: Yu Pei's Project Portfolio Page
---

### Project: nustracker

<br>

**Code Contributed:** [RepoSense](https://nus-cs2103-ay2122s1.github.io/tp-dashboard/?search=t11&sort=groupTitle&sortWithin=title&since=2021-09-17&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=false&tabOpen=true&tabType=authorship&tabAuthor=syoopie&tabRepo=AY2122S1-CS2103T-T11-1%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code~other&authorshipIsBinaryFileTypeChecked=false&zFR=false)

<br>

* **Enhancements to existing features**:
  * Maintained the `help` function, updated it with all the new features implemented.
  * Improved the GUI of the help function, make it easy for the user to copy commands to assist those who are more unfamiliar with the app.
  * Changed help window to use a dropdown box instead to accommodate for our growing list of commands.

<br>

* **New Feature**: `export`
  * What it does: Allows a user to export the emails of the current list of students that are being displayed
  * Justification: To allow user to easily acquire a file consisting of relevant emails so that they can copy it and email a large number of people at once.
  * Highlights: Had to conform with the original implementations of file/memory access implemented in AB3, also had to create a new class in storage component to manage the file creation and writing aspect of the exporting function
  * Function is very foolproof and has multiple checks to conform with standards of illegal characters and filename length.
  * Can be easily extended to export different fields of data, but only in the CSV file format.

<br>

* **Enhancements to UserGuide**:
  * Constantly maintained the userGuide and made changes and updates for it to conform with our actual implementation (e.g. Adding command to the command summary and brushing up command descriptions, update screenshots when GUI has been changed)
  * Contributed to discussion on UserGuide overhaul to make it more user-friendly for people who are less familiar with technology.

<br>

* **Enhancements to DeveloperGuide**:
  * Added use cases to developer guide.
  * Added the [Exporting Feature](../DeveloperGuide.html#exporting-feature) section.

<br>

* **Contributions to team tasks**:
  * Constantly pushed for PRs to be merged, made sure that all PRs were properly reviewed before merging.
  * Created and assigned issues on multiple occasions when my own testing uncovered a new bug.
  * Did a full refactoring of Person -> Student to bring the language of the code more in line with our project.
  * Set up the team repository / organisation and configured all the settings to allow for different workflows.
  
<br>

* **Community**:
  * Helped with PR reviews and pushed for merging to forward the progress of the application. Below are some examples:
    * [PR Review 1](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/61)
    * [PR Review 2](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/132)
  * Pointed out bugs / cosmetic issues in peers code and approached them to correct it
  * Responded to my teammates comments on my PRs and initiated discussion to improve code quality



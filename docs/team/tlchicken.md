---
layout: page
title: Elvis Teo's Project Portfolio Page
---

### Project: nustracker

**nustracker** is a standalone desktop app that aims to help event directors and administrative personnel of
student organisations from the NUS School of Computing to manage the organisation of undergraduate student events more easily.
It is built on top of **[AddressBook - Level 3](https://se-education.org/addressbook-level3)**, which is a desktop address book application used for teaching Software Engineering principles. 

Given below are my contributions to the project.

* **New Feature**: Added the ability to enroll students into events.
  * What it does: `enroll` - Allows the user to enroll students into the events that the students want to participate in.
  * Justification: This feature forms part of the base product as it allows students to be used together with events.
  * Highlights: This implementation was challenging as it required interlinking 2 different sets of classes which contain a wide array of subclasses - Student and Event, making them all work together.
  It was also tricky to devise a way to load the current enrolled events of a student from the JSON file, as all students and events have to be loaded fully first before this can happen.

* **New Feature**: Added the ability to remove students from events.
  * What it does: `remove` - Allows the user to remove students from the events that they are currently enrolled in.
  * Justification: This feature forms part of the base product as it allows students to be used together with events.
  * Highlights: The implementation was of similar type and difficulty to that of the enroll feature.

* **New Feature**: Added the ability to mass delete students from **nustracker**.
  * What it does: `delfiltered` - Allows the user to mass delete all students currently visible in the student list. The user can control which students are shown in the list using the `filter` command.
  * Justification: When a substantial number of students have to be deleted at once, (eg: After a batch of students graduate) it would be quite cumbersome for the user to delete students one by one. This command provides an easy way to remove multiple students at once, aligning with **nustracker**'s goals of helping to make it easier to process student data.
  * Highlights: The implementation of the part of the command that deletes the students was only moderately difficult. The more challenging part was to think of a way to only make the command work only when the students list is shown, since mass deleting students when the user has the event list open and thus cannot see what students they are being deleted, is dangerous.

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2122s1.github.io/tp-dashboard/?search=tlchicken&sort=groupTitle&sortWithin=title&since=2021-09-17&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=false&tabOpen=true&tabType=authorship&tabAuthor=TLChicken&tabRepo=AY2122S1-CS2103T-T11-1%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code&authorshipIsBinaryFileTypeChecked=false)


* **Enhancements to existing features**:
  * Changed the `edit` command to identify students by student ID instead of by index in the student list shown in the GUI. ([\#61](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/61))
  * Changed the `edit` command such that if the student ID of a student is edited, then the student ID of the corresponding Participant in this student's enrolled events will get updated as well. [\#101](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/101)
  * Changed the `delete` command such that when deleting students, that student would get removed from the participants list of all of that student's enrolled events. [\#110](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/110)
  * Changed the `delete` command such that when deleting events, that event would get removed from the enrolled events of all participants. [\#101](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/101)
  * Made the `filter` command work only when the students list is shown. [\#110](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/110)


* **Contributions to the User Guide**: (Pull requests [\#61](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/61), [\#110](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/110))
    * Added documentation for the features `enroll`, `remove` and `delfiltered`.
    * Helped to update many of the UI pictures. (Those with a black border around them.)

* **Contributions to the Developer Guide**: (Pull requests [\#32](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/32), [\#80](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/80), [\#100](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/100))
    * Added Introduction section, Non-Functional Requirements and Glossary.
    * Added Target User Profile and Value Proposition. Adapted User Stories from Team Discussions into Markdown table form and added it. (From Team Discussions)
    * Added Use Cases for `enroll` and `remove` commands. 
    * Added a section to describe the implementation of [Enrolling a Student into an Event](https://ay2122s1-cs2103t-t11-1.github.io/tp/DeveloperGuide.html#enrolling-a-student-into-an-event). Created the 2 sequence diagrams and the activity diagram found in this section.
    * Added test cases for manual testing.

* **Contributions to Team Tasks**:
  * Managed the release for `v1.2` and `v1.4` on GitHub.
  * Helped to set up Codecov integration and CI Banner for the team repo.
  * Helped to update the Developer Guide with the discussed User Stories, Target User Profile and Value Proposition.
  * Helped the team create product demo videos.

* **Community**:
  * PRs reviewed (with non-trivial review comments): [\#29](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/29), [\#30](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/30), [\#48](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/48)
  * List of all the PRs I had reviewed can be found [here](https://github.com/AY2122S1-CS2103T-T11-1/tp/pulls?q=is%3Apr+is%3Aclosed+commenter%3Atlchicken+).
  * Reported bugs and suggestions for other teams in the class (examples: [1](https://github.com/AY2122S1-CS2103T-W17-2/tp/issues/157), [2](https://github.com/AY2122S1-CS2103T-W17-2/tp/issues/156), [3](https://github.com/AY2122S1-CS2103T-W17-2/tp/issues/155), [4](https://github.com/AY2122S1-CS2103T-W17-2/tp/issues/151), [5](https://github.com/AY2122S1-CS2103T-W17-2/tp/issues/149), [6](https://github.com/AY2122S1-CS2103T-W17-2/tp/issues/134), [7](https://github.com/AY2122S1-CS2103T-W17-2/tp/issues/125))

---
layout: page
title: wowsiddanth's Project Portfolio Page
---

### Project: nustracker

![siddanth](names/siddanth.PNG)

__*nustracker*__ is an event-management software that was built specifically for the NUS student/manpower executive in mind. It is
a brownfield project that extends the AddressBook3 project, which is around 10kLoC.

* **New Feature**: Redesign Person class to behave like a Student class
  * **What it does**: Adds the necessary fields and methods so that the Person class behaves like a Student (_has a student ID, email, etc_).
  * **Justification**: This features redesigns the Person, so that it meets the specification of an NUS student, taking part in an event.
  * **Highlights**: This change affected almost many other class, as the Person class is a fundamental component of the initial AddressBook3 project. It
  was definitely challenging adding these new attributes, tracing, and fixing regressions.
  * **Credits**: - 

* **New Feature**: Ability to add/delete student information
  * **What it does**: Adds the relevant methods and attributes that allows for the deletion of every attribute of a student.
  * **Justification**: This allows for the user to edit a specific wrong inputted field, instead of deleting and re-entering that particular student.
  * **Highlights**: This change affected many other classes, especially so the test cases. It was tough remaking a plethora of test cases and adding in new ones, to ensure stability.
  * **Credits**: - 

* **New Feature**: Remake GUI to match mockup
  * **What it does**: Remakes the current GUI of the Main/Settings/Help window so that it matches the mockup proposed in _Figma_.
  * **Justification**: To beautify the product, and allow the user to have an elegant user experience.
  * **Highlights**: JavaFX, unlike many other frameworks for designing GUIs, is not as active as the rest. Thus, it was definitely tedious reading many articles and documentations posted by Oracle to gain an intuitive understanding. Additionally, it was also difficult as I had to learn CSS from scratch, from resources such as the Mozilla Foundation.
  * **Credits**: JavaFX documentation by Oracle, and the CSS resources by the Mozilla Foundation. 

* **New Feature**: Add dark/light theme
  * **What it does**: Enables the user to toggle between a dark theme and a light theme.
  * **Justification**: To add another layer of customization for the user.
  * **Highlights**: This required an extensive CSS knowledge so similarly, I had to read and learn about CSS through
   videos and articles by the Mozilla Foundation.
  * **Credits**: CSS resources by the Mozilla Foundation. <br>

* **New Feature**: Add profile picture
  * **What it does**: Allows the user to add profile pictures for added students.
  * **Justification**: To add another layer of customization for nustracker.
  * **Highlights**: This required the use of different JavaFX classes, and the information about manipulating the 
   different images types within storage. 
  * **Credits**: JavaFX Documentation 

* **New Feature**: Add customizable glow around profile picture
  * **What it does**: Allows the user to customize the colour of the glow around the profile picture.
  * **Justification**: To add another layer of customization.
  * **Highlights**: This was implemented fully using JavaFX and the corresponding effects, and thus, it required me 
   to gain a deeper understanding of the styling elements offered by JavaFX.
  * **Credits**: JavaFX Documentation 


* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2122s1.github.io/tp-dashboard/?search=wowsiddanth&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~test-code~other~functional-code&since=2021-09-17) 

* **Enhancements to existing features**:
  * Updated the GUI of the Main/Settings/Help window to match mockup on _Figma._
  * Added customization to nustracker
    * Ability to add profile pictures to students
    * Ability to customize glow around profile pictures 
    * Ability to toggle between dark and light mode
  * Modified Person class to be Student class.
  * Vetted and formatted the User Guide
  * Added relevant parts to the Developer Guide.


* **Documentation**:
  * User Guide:
    * Added _'Adding your first student', 'Adding your first event', and 'Adding your first student to your first event'_ sections to the UG. ([#223](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/223))
    * Added _'Customization'_ section to the UG. ([#132](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/132/files))
    * Added _'General Layout'_ section to the UG. ([#132](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/132/files))
    * Edited _'Features'_ section of the UG. ([#123](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/123), [#223](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/223))
    * Added feature introductions at the start of the UG: _Manage students with ease_, _Track event attendance_, and _Customize to your liking_. ([#268](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/268))
    * Added documentation for the features `add` and `delete`. ([#27](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/27))
    * Added documentation for the features `refresh` and `theme`. ([#144](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/144))
    * Rephrased many paragraphs, formatted whitespaces, etc.
    
  * Developer Guide:
    * Edited UML diagram for UI component, and added more description about the different components . ([#102](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/102))
    * Edited Developer Guide to add use cases for add student information, delete student information, changing profile picture glow, changing profile picture glow via the .json, and changing the profile picture. ([#253](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/253))
    * Added the _Changing the profile picture glow_ feature to the Developer Guide, under the _Implementation section_. ([#253](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/253)) 
    * Added two sequence diagrams (GlowSequenceDiagram.puml and UpdateStudentCardGlowSequenceDiagram.puml) under the _Changing the profile picture glow_ section. ([#253](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/253)) 


* **Community**:
   * Reviewed and carried out code reviews: [https://bit.ly/3bM6MVx](https://bit.ly/3bM6MVx)
   * Made many PRs: [https://bit.ly/3bT32lc](https://bit.ly/3bT32lc)
   * PRs reviewed and approved: [\#58](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/58), [\#48](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/48), [\#46](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/46), [\#33](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/33), [\#96](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/93), [#98](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/98), [\#110](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/110), [\#215](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/215), [\#12](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/12), [\#80](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/80), [\#91](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/91), [\#105](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/105), [#129](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/129), [\#145](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/145).
   * PRs reviewed (with non-trivial review comments): [\#58](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/58), [\#48](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/48), [\#46](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/46), [\#33](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/33), [\#96](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/93), [#98](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/98), [\#110](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/110), [\#215](https://github.com/AY2122S1-CS2103T-T11-1/tp/pull/215).


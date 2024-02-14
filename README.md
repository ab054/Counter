[![Rick Astley - Never Gonna Give You Up (Video)](https://img.youtube.com/vi/dQw4w9WgXcQ/0.jpg)](https://www.youtube.com/watch?v=dQw4w9WgXcQ)


# Espresso Tests for Jetpack Compose Android App

## Introduction

This project contains a suite of Espresso tests designed to test the Android application, developed with Jetpack Compose. The tests cover a range of user interactions and ensure the app's reliability and stability.

## Getting Started

```

└── uiTests
    ├── CommonTools.kt
    ├── PurchaseTest.kt
    ├── UiTestBase.kt
    ├── assets
    │   └── TestUser.kt
    └── pages
        ├── AddressPage.kt
        ├── BasePage.kt
        ├── CartPage.kt
        ├── ItemDetailsPage.kt
        ├── LoginPage.kt
        ├── PurchasePage.kt
        └── ShowcasePage.kt

```
### Prerequisites

- Android Studio Arctic Fox | 2020.3.1 or newer
- An Android device or emulator running Android API level 21 (Lollipop) or higher

### Installing

1. Clone the repository to your local machine.
2. Open the project in Android Studio.
3. Wait for Gradle to synchronize and build the project.

## Running the Tests

To run the Espresso tests, follow these steps:

1. Navigate to the `androidTest` directory in the Project view.
2. Right-click on the directory or any specific test file.
3. Choose `Run 'Tests in <directory or file name>'`.

Alternatively, you can use the following Gradle command:

```bash
./gradlew connectedAndroidTest
```


| ID | Flow         | Test Name                                      | Case                                   | Expected Result                       | Comments |
|----|--------------|------------------------------------------------|----------------------------------------|---------------------------------------|----------|
| 1  | Comment Flow | Comment button is present on the Details screen| no comments been made before           | should be visible                     |          |
| 2  | Comment Flow | Comment button is present on the Details screen| there are previous comments             | should be visible                     |          |
| 3  | Comment Flow | Comment button is present on the Details screen| user is authenticated                   | should be visible                     |          |
| 4  | Comment Flow | Comment button is present on the Details screen| user is unauthenticated                 | should be not visible                 |          |
| 5  | Comment Flow | Comment button located next to like button     | user is authenticated                   | location is according to the design   |          |
| 6  | Comment Flow | Comment button should be functional            | user is authenticated                   | navigates to Comment screen           |          |
| 7  | Comment Flow | Comment button should be functional            | there are previous comments             | navigates to Comment screen, previous comments are visible | |
| 9  | Comment Flow | Template dialog is present                     | fist time user                          | dialog is visible                     |          |
| 10 | Comment Flow | Template dialog can be closed                  | fist time user                          | tap close button closes the dialog    |          |
| 11 | Comment Flow | Template dialog is present                     | existing user                           | dialog is not present                 |          |
| 12 | Comment Flow | User can comment with Price cut template       | use the default template text and post it | comment is posted                   |          |
| 13 | Comment Flow | User can comment with Price cut template       | use the default template and modify text  | modified coment is posted            |          |
| 14 | Comment Flow | Comment text should be valid                   | empty text in comment input             | post button disabled                  |          |
| 15 | Comment Flow | Comment text should be valid                   | comment message too short               | warning is present, posting is disabled|          |
| 16 | Comment Flow | Comment text should be valid                   | comment message too long                | warning is present, posting is disabled|          |
| 17 | Comment Flow | Comment text should be valid                   | comment message has invalid simbols, words, etc | warning is present, posting is disabled | |
| 18 | Comment Flow | Duplicate comments not allowed                 | new comment matches text with existing  | warning is present, posting is disabled|          |
| 19 | Comment Flow | Posted comments listed on the Comment screen   | valid coment posted                     | comment is posted                     |          |
| 20 | Comment Flow | Posted comments listed in sorted order         | comment history exists                  | comment posted visible in the sorted order | |
| 21 | Comment Flow | Time of the post is valid                      | post been made in the past              | Time of comment is valid              |          |
| 22 | Delete Flow  | Details screen should display existing comments| comment history exists                  | valid number of post is displayed     |          |
| 23 | Delete Flow  | Details screen should display existing comments| comment history exists                  | last comment is displayed             |          |
| 24 | Delete Flow  | See more button is present on the Details screen | comment history exists                | button is displayed                   |          |
| 25 | Delete Flow  | See more button is functional                  | comment history exists                  | navigates to Comment screen           |          |
| 26 | Delete Flow  | Report button is present                       | post text is minimum length             | Report button is present              |          |
| 27 | Delete Flow  | Report button is present                       | post text is maximum length             | Report button is present              |          |
| 28 | Delete Flow  | Report button is present                       | post font size is minimum size          | Report button is present              |          |
| 29 | Delete Flow  | Report button is present                       | post font size is maximum size          | Report button is present              |          |
| 30 | Delete Flow  | Report button is functional                    | current user never reported target comment | navigates to Comment report screen   |          |
| 31 | Delete Flow  | Report button is functional                    | current user already reported target comment | warning is present, posting is disabled | |
| 32 | Delete Flow  | Report information dialog is present           | user tap report the comment first time |                                       |         |
| 33 | Delete Flow | Report information dialog is present          | user report the comment again         | Report information dialog is not present|          |
| 34 | Delete Flow | Report informnation dialog can be closed      | taps ok button                        | dialog is closed                        |          |
| 35 | Delete Flow | Coment Report screen has title                | user at report screen screen          | view is displayed                       |          |
| 36 | Delete Flow | Coment Report screen has chose reason option  | user at report screen screen          | view is displayed                       |          |
| 37 | Delete Flow | Coment Report screen has reason text input    | user at report screen screen          | view is displayed                       |          |
| 38 | Delete Flow | Coment Report screen has report comment button| user at report screen screen          | view is displayed                       |          |



# ToDo List Application Testing

## [Link to Test Plan](TestPlan.md)

## Overview
This repository contains the automated tests for the ToDo List application. The ToDo List app allows users to add, edit, delete, and view to-do items, providing a simple yet effective way to manage daily tasks.

## Tools and Frameworks

### Kaspresso
I utilize [Kaspresso](https://github.com/KasperskyLab/Kaspresso). Today I will everytime choose Kaspresso for a new project since I believe it is a superior library
for Android UI automation.

### Kakao
[Kakao](https://github.com/KakaoCup/Kakao) is used alongside Kaspresso to implement the Page Object pattern, which provides a clean and maintainable way to describe and interact with the application's UI elements.

## Project Structure

### Tests
The main test cases for the ToDo List application are located in the `tests` package. Key tests include:
- `AddToDoTest`: Tests for adding and deleting to-do items.

### Screens
The screens package contains the Page Object models for different screens in the application:
- `MainScreen`: Interactions and verifications for the main screen displaying the list of to-do items.
- `AddEditScreen`: Interactions for adding and editing to-do items.

### Gradle Configuration
The project is configured with the following key dependencies:
- AndroidX Compose for UI components
- Kaspresso and Kakao for UI testing
- Android Orchestrator for seamless clean state in between tests

## Potential Improvements
1. **Allure Reporting**: Integrate Allure for detailed test reports.
2. **Firebase Testing**: Integrate Firebase as an executor for tests.
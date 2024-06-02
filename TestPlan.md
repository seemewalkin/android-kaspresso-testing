# Test Plan for ToDo List Application

## Introduction
This test plan outlines the strategy and approach for testing the ToDo List application. The application allows users to add, edit, delete, and view to-do items.

## Features to be Tested

### Home View:
1. Display all to-do items.
2. Plus button to add a new to-do item.
3. Swipe to delete a to-do item.
4. Navigate to edit a to-do item.

### Add/Edit Detail View:
1. Display form for adding/editing a to-do item.
2. Form validation (title and description required).
3. Save button to add or update a to-do item.
4. Navigation back to the home view.

### Navigation:
1. Correct navigation between the home view and the add/edit detail view.
2. Proper handling of the back button.

## Test Scenarios and Test Cases

### Home View

#### Test Case 1: Display To-Do Items
- **Goal**: Verify that all to-do items are displayed correctly.
- **Precondition**: There are to-do items in the database or in the home view.
- **Steps**:
    1. Launch the application.
    2. Check the home view.
- **Expected Result**: All to-do items should be listed correctly. Each item should display its title and description.

#### Test Case 2: Add New To-Do Item
- **Goal**: Verify that a new to-do item can be added.
- **Precondition**: The application is on the home view.
- **Steps**:
    1. Click on the plus button.
    2. Enter a title in the title field.
    3. Enter a description in the description field.
    4. Click the save button.
    5. Check the home view.
- **Expected Result**: The new to-do item should appear in the home view with the added title and description.

#### Test Case 3: Swipe to Delete To-Do Item
- **Goal**: Verify that a to-do item can be deleted by swiping.
- **Precondition**: There are to-do items in the home view.
- **Steps**:
    1. Swipe a to-do item to the end.
    2. Confirm the deletion if prompted.
    3. Check the home view.
- **Expected Result**: The to-do item should be removed from the list.

#### Test Case 4: Navigate to Edit To-Do Item
- **Goal**: Verify that a to-do item can be edited.
- **Precondition**: There are to-do items in the home view.
- **Steps**:
    1. Click on a to-do item.
    2. Edit the title and/or description fields.
    3. Click the save button.
    4. Check the home view.
- **Expected Result**: The edited to-do item should be updated in the home view with the new title and/or description.

### Add/Edit Detail View

#### Test Case 5: Display Add To-Do Form
- **Goal**: Verify that the add to-do form is displayed correctly.
- **Precondition**: The application is on the add/edit detail view.
- **Steps**:
    1. Click on the plus button in the home view.
    2. Check the add/edit detail view.
- **Expected Result**: The form should display empty fields for title and description.

#### Test Case 6: Display Edit To-Do Form
- **Goal**: Verify that the edit to-do form is displayed correctly with pre-filled data.
- **Precondition**: There is a to-do item in the home view.
- **Steps**:
    1. Click on a to-do item in the home view.
    2. Check the add/edit detail view.
- **Expected Result**: The form should display the title and description of the selected to-do item.

#### Test Case 7: Form Validation
- **Goal**: Verify that the form validation works correctly.
- **Precondition**: The application is on the add/edit detail view.
- **Steps**:
    1. Leave the title and/or description fields empty.
    2. Click the save button.
- **Expected Result**: Application has been redirected to the home view.
- 
#### Test Case 8: Save To-Do Item
- **Goal**: Verify that the save functionality works correctly for both adding and editing to-do items.
- **Precondition**: The application is on the add/edit detail view.
- **Steps**:
    1. Fill in the title and description fields.
    2. Click the save button.
    3. Check the home view.
- **Expected Result**: The to-do item should be saved and the application should navigate back to the home view displaying the updated list.
### Navigation

#### Test Case 9: Navigate Between Views
- **Goal**: Verify correct navigation between home view and add/edit detail view.
- **Precondition**: The application is running.
- **Steps**:
    1. Click on the plus button to navigate to add/edit detail view.
    2. Click the back button to navigate back to home view.
    3. Click on a to-do item to navigate to edit detail view.
    4. Click the back button to navigate back to home view.
- **Expected Result**: The application should navigate correctly between views.

## Notes
1. Currently, there are no validations for the text fields :)
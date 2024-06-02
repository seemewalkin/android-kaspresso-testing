package com.programming.todolist.screens

import androidx.compose.ui.test.junit4.ComposeTestRule
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode
class AddEditScreen(private val composeTestRule: ComposeTestRule) : ComposeScreen<AddEditScreen>(composeTestRule) {
    private val titleField = KNode(composeTestRule) { hasTestTag("TitleField") }
    private val descriptionField = KNode(composeTestRule) { hasTestTag("DescriptionField") }
    private val saveButton = KNode(composeTestRule) { hasTestTag("SaveButton") }

    fun addToDoItem(title: String, description: String) {
        titleField.performClick()
        titleField.performTextInput(title)
        descriptionField.performClick()
        descriptionField.performTextInput(description)
        saveButton.performClick()
    }
}

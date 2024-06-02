package com.programming.todolist.screens

import androidx.compose.ui.test.junit4.ComposeTestRule
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode
import androidx.compose.ui.test.swipeLeft

class MainScreen(private val composeTestRule: ComposeTestRule) : ComposeScreen<MainScreen>(composeTestRule) {
    private val addButton = KNode(composeTestRule) { hasTestTag("AddButton") }

    fun clickAddButton() {
        addButton.performClick()
    }

    fun verifyToDoItemDisplayed(title: String) {
        KNode(composeTestRule) { hasText(title) }.assertIsDisplayed()
    }

    fun verifyToDoItemNotDisplayed(title: String) {
        KNode(composeTestRule) { hasText(title) }.assertIsNotDisplayed()
    }

    fun deleteToDoItem(title: String) {
        KNode(composeTestRule) { hasText(title) }.performTouchInput { swipeLeft() }
    }
}

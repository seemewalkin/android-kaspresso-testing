package tests

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.programming.todolist.MainActivity
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import com.programming.todolist.screens.MainScreen
import com.programming.todolist.screens.AddEditScreen

class AddToDoTest : TestCase() {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    private val mainScreen = MainScreen(composeTestRule)
    private val addEditScreen = AddEditScreen(composeTestRule)

    private val addTodo = Todo(
        title = "Buy Groceries",
        description = "Milk, Bread, Cheese, and Eggs"
    )

    private val deleteTodo = Todo(
        title = "Workout",
        description = "Go to the gym for a 1-hour workout"
    )

    data class Todo(
        val title: String,
        val description: String
    )

    @Test
    fun testAddToDoItem() {
        mainScreen.clickAddButton()
        addEditScreen.addToDoItem(addTodo.title, addTodo.description)
        mainScreen.verifyToDoItemDisplayed(addTodo.title)
    }

    @Test
    fun testDeleteToDoItem() {
        mainScreen.clickAddButton()
        addEditScreen.addToDoItem(deleteTodo.title, deleteTodo.description)
        mainScreen.deleteToDoItem(deleteTodo.title)
        mainScreen.verifyToDoItemNotDisplayed(deleteTodo.title)
    }
}

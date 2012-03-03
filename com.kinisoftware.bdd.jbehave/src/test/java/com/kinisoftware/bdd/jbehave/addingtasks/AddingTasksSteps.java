package com.kinisoftware.bdd.jbehave.addingtasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.kinisoftware.bdd.jbehave.Task;
import com.kinisoftware.bdd.jbehave.ToDoList;

public class AddingTasksSteps {

	private ToDoList toDoList;

	@Given("an empty to-do list")
	public void createEmptyToDoList() {
		toDoList = new ToDoList();
	}

	@When("you add the task: $task")
	public void addTask(String task) {
		toDoList.addTask(new Task(task));
	}

	@Then("the to-do list contains the task: $task")
	public void toDoListMustContainOneTask(String task) {
		assertThat(toDoList.nextTask(), is(new Task(task)));
	}

	@Then("the number of tasks into to-do list should be $numberOfTasks")
	public void the_number_of_tasks_into_to_do_list_should_be(int numberOfTasks) {
		assertThat(toDoList.getNumberOfTasks(), is(numberOfTasks));
	}
}

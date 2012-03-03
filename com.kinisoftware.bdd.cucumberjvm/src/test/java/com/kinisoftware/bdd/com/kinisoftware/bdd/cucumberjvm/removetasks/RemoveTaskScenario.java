package com.kinisoftware.bdd.com.kinisoftware.bdd.cucumberjvm.removetasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.kinisoftware.bdd.com.kinisoftware.bdd.cucumberjvm.Task;
import com.kinisoftware.bdd.com.kinisoftware.bdd.cucumberjvm.ToDoList;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class RemoveTaskScenario {

	private ToDoList toDoList;

	@Given("^a To-Do list with the task: (.+)$")
	public void a_To_Do_list_with_the_task(String task) {
		toDoList = new ToDoList();
		toDoList.addTask(new Task(task));
	}

	@When("^you mark done the task: (.+)$")
	public void you_mark_done_the_task(String description) {
		toDoList.markDone(new Task(description));
	}

	@Then("^the number of tasks into to-do list should be (\\d+)$")
	public void the_number_of_tasks_into_to_do_list_should_be(int numberOfTasks) {
		assertThat(toDoList.getNumberOfTasks(), is(numberOfTasks));
	}

}

package com.kinisoftware.bdd.com.kinisoftware.bdd.cucumberjvm.addtasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.kinisoftware.bdd.com.kinisoftware.bdd.cucumberjvm.Task;
import com.kinisoftware.bdd.com.kinisoftware.bdd.cucumberjvm.ToDoList;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class AddTaskScenario {
	
	private ToDoList toDoList;

	@Given("^an empty to-do list$")
	public void createEmptyToDoList() {
		toDoList = new ToDoList();
	}
	
	@When("^you add the task: (.+)$")
	public void addTask(String task) {		
		toDoList.addTask(new Task(task));
	}
	
	@Then("^the to-do list contains the task: (.+)$")
	public void toDoListMustContainOneTask(String task) {
		assertThat(toDoList.nextTask(), is(new Task(task)));
	}
	
	@And("^the number of tasks into to-do list should be (\\d+)$")
	public void the_number_of_tasks_into_to_do_list_should_be(int numberOfTasks) {
		assertThat(toDoList.getNumberOfTasks(), is(numberOfTasks));
	}
}

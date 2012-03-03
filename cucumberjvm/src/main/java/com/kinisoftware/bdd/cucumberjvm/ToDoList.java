package com.kinisoftware.bdd.cucumberjvm;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

	private List<Task> tasks;

	public ToDoList() {
		tasks = new ArrayList<Task>();
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public Task nextTask() {
		return tasks.get(0);
	}

	public Integer getNumberOfTasks() {
		return tasks.size();
	}

	public void markDone(Task task) {
		tasks.remove(task);
	}
}

package com.kinisoftware.bdd.spock.specification.addingtasks

import spock.lang.Specification

import com.kinisoftware.bdd.spock.Task
import com.kinisoftware.bdd.spock.ToDoList

class AddingTasksSpecification extends Specification {

	def "Add task in empty to-do list"() {
		setup:
		def toDoList = new ToDoList()
		def taskDescription = "do laundry"

		when:
		toDoList.addTask(new Task(taskDescription))

		then:
		toDoList.getNumberOfTasks() == 1
		toDoList.nextTask() == new Task(taskDescription)
	}
}

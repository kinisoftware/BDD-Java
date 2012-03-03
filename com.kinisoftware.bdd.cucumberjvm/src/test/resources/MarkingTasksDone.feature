 Feature: marking tasks done
	You can mark tasks done in To-Do list
	   
 Scenario: Mark task done in To-Do list with just 1 task
   Given a To-Do list with the task: do laundry
   When you mark done the task: do laundry
   Then the number of tasks into to-do list should be 0
 Feature: adding tasks in To-Do List
 	To-Do List can contains several tasks
   
 Scenario: Add task in empty to-do list
   Given an empty to-do list  
   When you add the task: do laundry 
   Then the to-do list contains the task: do laundry
   And the number of tasks into to-do list should be 1
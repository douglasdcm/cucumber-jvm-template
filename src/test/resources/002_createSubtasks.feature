Feature: Create SubTask
  As a ToDo App user 
  I should be able to create a subtask 
  So I can break down my tasks in smaller pieces

  Scenario: Creating a new subtask
    Given I has access to My Tasks page
    When I click on Manage Subtasks button
    Then A new dialog box opens up
    And It should have a read only field with the task ID
    And It shound have a task description field
    When I add the SubTask and the Description and due date  
		 | Due Date   | SubTask Desc   | 
		 | 01/23/2020 | Description1   | 
		 | 2018-01-23 | Description2   |
		 | 2020/01/23 | Description3   |			 
		 | 2020/23/01 | Description4   |		 
		 | 23/01/2020 | Description5   |
		 | 01/23/2018 | Description6   |
		 |            | Description7   |
		 | test123    | Description8   |
		 | 00/00/0000 | Description9   |
		 | 01/23/2020 |                |
		 | 01/23/2020 | Description10  |
		 | 01/23/2020 | Description11  |
		 | 01/23/2020 | Description12  |
		 | 01/23/2020 | Description13  |
		 | 01/23/2020 | ttttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaa | 
		 | 01/23/2020 | Description14  |
    Then The subtask should be appended on the bottom of the box
    And The Manage Subtasks button should have the number of subtasks
   
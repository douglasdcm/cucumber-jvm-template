Feature: Delete Task
  As a ToDo App user 
  I should be able to delete a task 
  So I can remove undesired tasks from my list

  Scenario: Deleting a task
    Given I has access to My Tasks page
    When I click on Remove Task button
    Then The task is remove from list
   
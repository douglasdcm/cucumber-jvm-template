Feature: Delete Subtask
  As a ToDo App user 
  I should be able to delete a subtask 
  So I can remove undesired subtasks from my list

  Scenario: Deleting a subtask
    Given I has access to My Tasks page
    When I click on Manage Subtask
    Then The subtask box is opened
    When I click on Remove Subtask
    Then The subtask is removed from list
   
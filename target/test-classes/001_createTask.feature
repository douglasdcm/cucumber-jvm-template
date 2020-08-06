Feature: Create Task
  As a ToDo App user 
  I should be able to create a task 
  So I can manage my tasks

  Scenario: Creating a new task
    Given I can navigate to any page
    Then I should always see the My Tasks link on the NavBar
    When I click this link
    Then I will be redirected to a page with all created tasks
    And I should see a message on the top part saying that the list belongs to me
    When I enter a new task    
		 | Task Name   |
		 | taskSeleneum1 |
		 | t             | 
		 | ta            | 
		 | tas           | 
		 |               | 
		 | ttttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaa | 
    Then The task should be appended on the list of created tasks
   
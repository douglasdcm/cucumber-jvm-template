import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppSteps {
	private WebDriver driver;
	
	@Before public void setUpTest() {
		//setUp browser
				System.setProperty("webdriver.gecko.driver", "C:\\Douglas\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("https://qa-test.avenuecode.com/");
				driver.getPageSource().contains("ToDo");
				driver.manage().window().maximize();
				
				//access home page
				PageObject.HomePage.signInMenu(driver).click();
				assertTrue(PageObject.HomePage.signInText(driver).isDisplayed());
				assertTrue(PageObject.HomePage.signInText(driver).getText().contains("Sign in"));
				
				//sign in to app
				PageObject.HomePage.emailBox(driver).sendKeys("douglas.dcm@gmail.com");
				PageObject.HomePage.passwordBox(driver).sendKeys("acode2017");
				PageObject.HomePage.signInButton(driver).click();
				assertTrue(PageObject.MyTasksPage.welcomeText(driver).isDisplayed());
				assertTrue(PageObject.MyTasksPage.welcomeText(driver).getText().contains("Welcome"));
	}
	
	@After public void finishTest() {
		PageObject.MyTasksPage.signOutLink(driver).click();
		assertTrue(PageObject.HomePage.todoText(driver).getText().contains("ToDo"));
	    driver.quit();
	}
	
	@Given("^I can navigate to any page$")
	public void i_navigate_to_any_page() throws Throwable {
		//access home page
		PageObject.HomePage.homeMenu(driver).click();
		assertTrue(PageObject.HomePage.todoText(driver).getText().contains("ToDo"));
	}

	@Then("^I should always see the My Tasks link on the NavBar$")
	public void i_should_always_see_the_My_Tasks_link_on_the_NavBar() throws Throwable {
		assertTrue(PageObject.HomePage.myTasksMenu(driver).getText().contains("My Tasks"));
	}

	@When("^I click this link$")
	public void i_click_this_link() throws Throwable {
		PageObject.HomePage.myTasksMenu(driver).click();
	}

	@Then("^I will be redirected to a page with all created tasks$")
	public void i_will_be_redirected_to_a_page_with_all_created_tasks() throws Throwable {
		//access task page
		assertTrue(PageObject.MyTasksPage.todoListText(driver).getText().contains("ToDo"));
	}

	@Then("^I should see a message on the top part saying that the list belongs to me$")
	public void i_should_see_a_message_on_the_top_part_saying_that_the_list_belongs_to_me() throws Throwable {
		assertTrue(PageObject.MyTasksPage.welcomeText(driver).getText().contains("Welcome"));
		assertTrue(PageObject.MyTasksPage.todoListText(driver).getText().contains("Douglas"));
	}

	@When("^I enter a new task$")
	public void i_enter_a_new_task(DataTable dt) throws Throwable {
			List<Map<String, String>> list = dt.asMaps(String.class, String.class);
			for(int i=0; i<list.size(); i++) {
				PageObject.MyTasksPage.taskNameBox(driver).sendKeys(list.get(i).get("Task Name"));
				
				//enter task by add button				
				PageObject.MyTasksPage.addTaskButton(driver).click();
				
				//assertions
				assertTrue(PageObject.MyTasksPage.firstTaskGrid(driver).getText().contains(list.get(i).get("Task Name")));
				assertTrue(PageObject.MyTasksPage.firstTaskGrid(driver).getText().length() >= 3);
				assertTrue(PageObject.MyTasksPage.firstTaskGrid(driver).getText().length() <= 250);				
				
				//enter task hitting Enter
				PageObject.MyTasksPage.taskNameBox(driver).sendKeys(list.get(i).get("Task Name"));
				PageObject.MyTasksPage.taskNameBox(driver).sendKeys(Keys.RETURN);
				
				//assertions
				assertTrue(PageObject.MyTasksPage.firstTaskGrid(driver).getText().contains(list.get(i).get("Task Name")));
				assertTrue(PageObject.MyTasksPage.firstTaskGrid(driver).getText().length() >= 3);
				assertTrue(PageObject.MyTasksPage.firstTaskGrid(driver).getText().length() <= 250);				
			}
	}
	
	@Then("^The task should be appended on the list of created tasks$")
	public void the_task_should_be_appended_on_the_list_of_created_tasks() throws Throwable {
		assertTrue(PageObject.MyTasksPage.firstTaskGrid(driver).isDisplayed());
	} 
	
	@Then("^The Manage Subtasks button should have the number of subtasks$")
	public void this_button_should_have_the_number_of_subtasks() throws Throwable {
		assertTrue(PageObject.MyTasksPage.manageSubtasks(driver).getText().matches("[(][0-9]*[)] Manage Subtasks"));
	}

	@When("^I click on Manage Subtasks button$")
	public void i_click_this_button() throws Throwable {
		PageObject.MyTasksPage.manageSubtasks(driver).click();
	}

	@Then("^A new dialog box opens up$")
	public void a_new_dialog_box_opens_up() throws Throwable {
	    assertTrue(PageObject.SubtasksPage.subtaskIdText(driver).getText().contains("Editing"));
	}

	@Then("^It should have a read only field with the task ID$")
	public void it_should_have_a_read_only_field_with_the_task_ID() throws Throwable {
		assertTrue(PageObject.SubtasksPage.subtaskIdText(driver).isDisplayed());
		assertTrue(PageObject.SubtasksPage.subtaskIdText(driver).getText().matches("Editing Task [0-9]*"));		
	}

	@Then("^It shound have a task description field$")
	public void the_task_description() throws Throwable {
		assertTrue(PageObject.SubtasksPage.subtaskDescriptionBox(driver).isDisplayed());
	}

	@When("^I add the SubTask and the Description and due date$")
	public void i_add_the_SubTask_Description_and_due_date(DataTable dt) throws Throwable {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for(int i=0; i<list.size(); i++) {
			PageObject.SubtasksPage.subtaskDescriptionBox(driver).sendKeys(list.get(i).get("SubTask Desc"));
			PageObject.SubtasksPage.dueDateBox(driver).clear();
			PageObject.SubtasksPage.dueDateBox(driver).sendKeys(list.get(i).get("Due Date"));
			
			//enter task by add button				
			PageObject.SubtasksPage.addSubtaskButton(driver).click();
			//assertions
			assertTrue(PageObject.SubtasksPage.firstSubtaskGrid(driver).getText().length() <= 250);
			assertTrue(PageObject.SubtasksPage.firstSubtaskGrid(driver).getText().length() > 0);
			
			//enter task hitting Enter
			PageObject.SubtasksPage.subtaskDescriptionBox(driver).sendKeys(list.get(i).get("SubTask Desc"));
			PageObject.SubtasksPage.dueDateBox(driver).clear();
			PageObject.SubtasksPage.dueDateBox(driver).sendKeys(list.get(i).get("Due Date"));
			PageObject.SubtasksPage.subtaskDescriptionBox(driver).sendKeys(Keys.RETURN);
						
		}
	}

	@Then("^The subtask should be appended on the bottom of the box$")
	public void the_subtask_should_be_appended_on_the_bottom_of_the_box() throws Throwable {
		assertTrue(PageObject.SubtasksPage.firstSubtaskGrid(driver).isDisplayed());
		PageObject.SubtasksPage.closeButton(driver).click();
	}
	
	@Given("^I has access to My Tasks page$")
	public void i_has_access_to_My_Tasks_page() throws Throwable {
		PageObject.HomePage.myTasksMenu(driver).click();
		assertTrue(PageObject.MyTasksPage.welcomeText(driver).getText().contains("Welcome"));
	}

	@When("^I click on Remove Task button$")
	public void i_click_on_Remove_Task_button() throws Throwable {
		PageObject.MyTasksPage.removeTasks(driver).click();
	}

	@Then("^The task is remove from list$")
	public void the_task_is_remove_from_list() throws Throwable {
		assertTrue(PageObject.MyTasksPage.addTaskButton(driver).isDisplayed());
	}
	
	@When("^I click on Manage Subtask$")
	public void i_click_on_Manage_Subtask() throws Throwable {
	    PageObject.MyTasksPage.manageSubtasks(driver).click();
	}

	@Then("^The subtask box is opened$")
	public void the_subtask_box_is_opened() throws Throwable {
	    assertTrue(PageObject.SubtasksPage.subtaskIdText(driver).getText().contains("Editing"));
	   //creating a subtask to be deleted
	   PageObject.SubtasksPage.subtaskDescriptionBox(driver).sendKeys("testDelete");
	   PageObject.SubtasksPage.dueDateBox(driver).sendKeys("10/23/2020");
	   PageObject.SubtasksPage.addSubtaskButton(driver).click();
	}

	@When("^I click on Remove Subtask$")
	public void i_click_on_Remove_Subtask() throws Throwable {
	    PageObject.SubtasksPage.removeSubtaskButton(driver).click();
	}

	@Then("^The subtask is removed from list$")
	public void the_subtask_is_removed_from_list() throws Throwable {
		assertTrue(PageObject.SubtasksPage.subtaskIdText(driver).getText().contains("Editing"));
		PageObject.SubtasksPage.closeButton(driver).click();
		assertTrue(PageObject.MyTasksPage.welcomeText(driver).isDisplayed());
	}

	
}

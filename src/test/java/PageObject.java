import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
	
	public static class HomePage {
		
		public static WebElement signInMenu (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("ul.nav.navbar-nav.navbar-right > li:nth-child(1) > a"));
			return element;
		}
		
		public static WebElement emailBox(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.id("user_email"));
			return element;
		}
		
		public static WebElement signInText(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("div.panel-heading > h4"));
			return element;
		}
		
		public static WebElement passwordBox(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.id("user_password"));
			return element;
		}
		
		public static WebElement signInButton(WebDriver driver){
			WebElement element = null;
			String locator = "commit";
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement genericElement = wait.until(ExpectedConditions.elementToBeClickable(By.name(locator)));
			element = driver.findElement(By.name(locator));
			return element;
		}
		
		public static WebElement homeMenu (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("ul:nth-child(1) > li:nth-child(1) > a"));
			return element;
		}
		
		public static WebElement myTasksMenu (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("ul:nth-child(1) > li:nth-child(2) > a"));
			return element;
		}
		
		public static WebElement todoText (WebDriver driver){
			WebElement element = null;
			String locator = "center > h1";
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement genericElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
			element = driver.findElement(By.cssSelector(locator));
			return element;
		}
	}
	
	public static class MyTasksPage {
		
		public static WebElement welcomeText (WebDriver driver){
			WebElement element = null;
			String locator = "ul.nav.navbar-nav.navbar-right > li:nth-child(1) > a";
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement genericElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
			element = driver.findElement(By.cssSelector(locator));
			return element;
		}
		
		public static WebElement taskNameBox (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.id("new_task"));
			return element;
		}
		
		public static WebElement addTaskButton (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("form[name=\"task_form\"] span"));
			return element;
		}
		
		public static WebElement firstTaskGrid (WebDriver driver){
			WebElement element = null;
			String locator = "tr:nth-child(1) > td.task_body.col-md-7 > a";
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement genericElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
			element = driver.findElement(By.cssSelector(locator));
			return element;
		}
		
		public static WebElement secondTaskGrid (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("tr:nth-child(2) > td.task_body.col-md-7 > a"));
			return element;
		}
		
		public static WebElement todoListText (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("div.container > h1"));
			return element;
		}
		
		public static WebElement signOutLink (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("ul.nav.navbar-nav.navbar-right > li:nth-child(2) > a"));
			return element;
		}
		
		public static WebElement manageSubtasks (WebDriver driver){
			WebElement element = null;
			String locator = "tr:nth-child(1) > td:nth-child(4) > button";
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement genericElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
			element = driver.findElement(By.cssSelector(locator));
			return element;
		}
		
		public static WebElement removeTasks (WebDriver driver){
			WebElement element = null;
			String locator = "tr:nth-child(1) > td:nth-child(5) > button";
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement genericElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
			element = driver.findElement(By.cssSelector(locator));
			return element;
		}
		
				
}

	public static class SubtasksPage {
		
		public static WebElement subtaskIdText (WebDriver driver){
			WebElement element = null;
			String locator = "div.modal-header.ng-scope > h3";
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement genericElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
			element = driver.findElement(By.cssSelector(locator));
			return element;
		}
		
		public static WebElement taskBox(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.id("edit_task"));
			return element;
		}
		
		public static WebElement subtaskDescriptionBox(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.id("new_sub_task"));
			return element;
		}
		
		public static WebElement dueDateBox(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.id("dueDate"));
			return element;
		}
		
		public static WebElement addSubtaskButton(WebDriver driver){
			WebElement element = null;
			String locator = "add-subtask";
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement genericElement = wait.until(ExpectedConditions.elementToBeClickable(By.id(locator)));
			element = driver.findElement(By.id(locator));
			return element;
		}
		
		public static WebElement closeButton(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("div.modal-footer.ng-scope > button"));
			return element;
		}
		
		public static WebElement removeSubtaskButton(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("td:nth-child(3) > button"));
			return element;
		}
		
		public static WebElement firstSubtaskGrid(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("td.task_body.col-md-8 > a"));
			return element;
		}
		
	}

}
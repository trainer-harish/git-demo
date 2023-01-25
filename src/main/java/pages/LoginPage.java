package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	
	private WebDriver driver;
	
	//locators object repository
	private By userName = By.id("email");
	private By password = By.id("pass");
	private By loginButton = By.id("login-button");
	private By errorMessage = By.xpath("//*[contains(text(),'Epic sadface:')]");
	
	// 2. Constructor of the page class:
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}

	
	
		// 3. page actions:
		
		public String getPageTitle() {
			return driver.getTitle();
		}
		
		public void enterUserName(String username) {
		driver.findElement(userName).sendKeys(username);
		}

		public void enterPassword(String pwd) {
			driver.findElement(password).sendKeys(pwd);
		}

		public void clickOnLogin() {
			driver.findElement(loginButton).click();
			
		}

}

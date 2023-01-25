package stepdifinition;

import factories.DriverFactory;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.LoginPage;

public class LoginSteps {
	LoginPage login = new LoginPage(DriverFactory.getDriver());
	
	
	@Given("user is on LUMA app")
	public void user_is_on_luma_app() {
	 DriverFactory.getDriver().get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
	}


	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String uname, String pass) {
		login.enterUserName(uname);
		login.enterPassword(pass);
	   
	}
	@Then("user is logged in successfully")
	public void user_is_logged_in_successfully() {
	   Assert.assertEquals(login.getPageTitle(), "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
	}


}

package EcommStepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import EcomPageObject.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefn {
	
	public WebDriver driver;
	public loginPage loginpg;
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		loginpg = new loginPage(driver);
	    
	}

	@When("User opens url {string}")
	public void user_opens_url(String Url) {
		driver.get(Url);
	    
	}

	@And("User enters email id as {string} and Password as {string}")
	public void user_enters_email_id_as_and_password_as(String emailadd, String password) {
		loginpg.enterEmail(emailadd);
		loginpg.enterPasswrd(password);
	    
	}

	@And("click on Login")
	public void click_on_login() {
		loginpg.ClkLoginbutton();
	    
	}

	@Then("Page title should be {string}")
	public void  Page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	    
	}

	@When("Use click on logout link")
	public void use_click_on_logout_link() {
		
		loginpg.Clklogoutbutton();
	    
	}

	

	@And("Close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	   
	}



}

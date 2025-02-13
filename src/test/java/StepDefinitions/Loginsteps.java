package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	
	@Given("User  is on login page")
	public void user_is_on_login_page() {
	    System.out.println("inside step=user is on login page");
	}

	@When("user enters username and passwod")
	public void user_enters_username_and_passwod() {
		System.out.println("inside step=user enters username and passwod");
	}

	@And("press on login button")
	public void press_on_login_button() {
		System.out.println("inside step=press on login button");
	}

	@Then("user will able to navigate to Home page")
	public void user_will_able_to_navigate_to_home_page() {
		System.out.println("inside step=user will able to navigate to Home page");
	}
}

package EcomPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver lDriver;
	public loginPage(WebDriver rDriver) 
	{

		lDriver =rDriver;
		PageFactory.initElements(rDriver, this);
	}

	
	@FindBy(id ="Email")
	WebElement email;		
	@FindBy(id="Password")
	WebElement Password;
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement LoginBtn;
	@FindBy (linkText= "Logout")
	WebElement logout;
	
	public void enterEmail(String emailadd) {
		email.clear();
		email.sendKeys(emailadd);
	}
	
	public void enterPasswrd(String Pwd) {
		Password.clear();
		Password.sendKeys(Pwd);
		
	}
	public void ClkLoginbutton() {
		LoginBtn.click();
		
	}
	public void Clklogoutbutton() {
		logout.click();
		
}
}

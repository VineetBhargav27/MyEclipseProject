package multipledataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases {
	
	public static WebDriver driver;
	public static SoftAssert softassert=new SoftAssert();
	@Test
	public static void ninjalogintest(String Username, String passwrd) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.id("input-password")).sendKeys(passwrd);
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		softassert.assertTrue(driver.findElement(By.linkText("My Account")).isDisplayed());
		softassert.assertAll();
		driver.quit();
		
	}
	@Test
	public static void rediffmail(String Username, String passwrd) {
		driver.get("https://mail.rediff.com/");
		driver.findElement(By.id("login1")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(passwrd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		softassert.assertTrue(driver.findElement(By.linkText("My Account")).isDisplayed());
		softassert.assertAll();
		driver.quit();
		
	}
	

}

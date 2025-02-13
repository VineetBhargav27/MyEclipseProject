package Testngdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
public class datadrivenusingTestng {
	
	WebDriver driver;
	
	
	@Test(dataProvider="getData")
	void ninjalogintest(String username,String pswd) throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("input-password")).sendKeys(pswd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		System.out.println("account logo "+ status);
		if(status=true) {
			driver.findElement(By.linkText("Logout")).click();
			Assert.assertTrue(true);
			}
		else 
		{
			Assert.fail();
		}
	driver.quit();
		}
      @DataProvider
      Object [][]  getData() {
    	  Object [][] data = {{"vinu.vineet27@gmail.com","asuvi@123"},
    			              {"seleniumpanda1@gmail.com","Selenium@123"},
    	                      {"seleniumpanda2@gmail.com","Selenium@123"},
    	                      {"seleniumpanda3@gmail.com","Selenium@123"}};
    	  
    	  return data;
    	  }
    	  
        }


package Testngdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class datadriventestng {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void login() throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("vinu.vineet27@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("asuvi@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		Boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		System.out.println("account logo "+ status);
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Thread.sleep(2000);
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
			
		}
			
	
		
		
	}
	
	//@AfterClass
	//void close() {
		//driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//}

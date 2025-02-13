package Testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*open hrm page
 Logo is dispaly
login
close
*/

public class Orangehrm {
	
	WebDriver driver;
	@Test(priority=1)
	
	void openapp()
	{
		
		
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
    void logodisplya() throws InterruptedException {
    Thread.sleep(2000);	
	  Boolean  status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println("logo display"+ status);
   }
	@Test(priority=3)
    void login() {
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
    }
     @Test(priority=4)
     void close() {
	   driver.quit();
	
}


}

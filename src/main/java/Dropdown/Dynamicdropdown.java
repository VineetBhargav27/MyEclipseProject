package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	   driver.findElement(By.xpath("//span[text()='From']")).click();
	   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pat");
	   driver.findElement(By.xpath("//span[text()='Patna']")).click();
	   driver.findElement(By.xpath("//span[text()='To']")).click();
	   driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("DEL");
	   driver.findElement(By.xpath("//span[text()='New Delhi']")).click();
	   
		
		

	}

}

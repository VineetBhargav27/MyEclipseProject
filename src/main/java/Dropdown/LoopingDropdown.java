package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoopingDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		String preselection= driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("total pessenger before easy my trip: " + preselection);
		driver.findElement(By.id("spnTraveller")).click();
		
		int adult= 1;
		while(adult<4) {
			driver.findElement(By.xpath("//button[@id='add'and @class='add plus_box1']")).click();
		adult=adult+1;
		}
		int child= 1;
		while(child<5) {
			driver.findElement(By.xpath("//button[@id='add'and @class='add plus_boxChd']")).click();
		child=child+1;
		}
		int infant= 1;
		while(infant<2) {
		driver.findElement(By.xpath("//button[@id='add'and @class='add plus_box1Inf']")).click();
		infant=infant+1;
		}
		String postselection= driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("total pessenger after easy my trip: " + postselection);
	}

}

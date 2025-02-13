package MouseSimulation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightclick {

	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://demoqa.com/buttons");
		//WebElement rightclkbutton =  driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		  Actions act=new Actions(driver);
		  //act.contextClick(rightclkbutton).build().perform();// right click 
		  WebElement doubleclkbutton =  driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));  
		  act.doubleClick(doubleclkbutton).build().perform();
	}

}

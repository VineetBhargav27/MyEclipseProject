package MouseSimulation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehoverover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://www.flipkart.com/");
		 WebElement ele= driver.findElement(By.xpath("//img[@alt='Fashion']"));
		 Actions act= new Actions(driver);
		 act.moveToElement(ele).build().perform();

	}

}

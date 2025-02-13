package MouseSimulation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragndrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");// TODO Auto-generated method stub
      //find source n target webelement
		  WebElement source=driver.findElement(By.id("box6"));
		  WebElement target=driver.findElement(By.id("box106"));
		  Actions act= new Actions(driver);
		  act.dragAndDrop(source, target).build().perform();
	}

}

package HandleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_script_popup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		WebElement textareafeild=driver.findElement(By.id("ta1"));
		WebElement alertbutton= driver.findElement(By.id("alert1"));
		jse.executeScript("arguments[0].value='vineet'", textareafeild);
		jse.executeScript("window.scrollBy(0,600)");
		jse.executeScript("arguments[0].click()", alertbutton);
		

	}

}

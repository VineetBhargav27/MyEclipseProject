package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownbrowserstack {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
			
			
			
			WebElement developers_dropdown = driver.findElement(By.id("developers-menu-toggle"));
			Select objSelect = new Select(developers_dropdown);
			objSelect.selectByIndex(2);
			/*Thread.sleep(3000);
			driver.navigate("https://www.browserstack.com/");
			WebElement solutions_dropdown = driver.findElement(By.id("solutions-menu-dropdown"));
			Select solutions = new Select(solutions_dropdown);
			solutions.selectByValue("4000");
			Thread.sleep(3000);
			WebElement solutions_d = driver.findElement(By.id("solutions-menu-dropdown"));
			Select s1 = new Select(solutions_d();
			s1.selectByVisibleText("Geolocation Testing"); 
			}
	}

	}*/

	}
}
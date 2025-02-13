package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownusingSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	WebElement countryelement=	driver.findElement(By.xpath("//select[@id='country']"));
		Select dropcountry= new Select(countryelement);
         //select option from dropdown
		//dropcountry.selectByIndex(2);
		//dropcountry.selectByVisibleText("India");
		dropcountry.selectByValue("india");
		//capture the options from dropdown
	List <WebElement>options=	dropcountry.getOptions();
	System.out.println("total options in dropdown" + options.size() );
	//printing options
	for(int i=0;i< options.size();i++) {
		System.out.println(options.get(i).getText());
		
	}
		
		//driver.close();
	}

}

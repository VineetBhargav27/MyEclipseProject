package HandleWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*how many rows in table
 * how many column in table
 * retrieve the specific row/column data
 * retrieve all the data from the table
 */



public class staticwebtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		
		

	}

}

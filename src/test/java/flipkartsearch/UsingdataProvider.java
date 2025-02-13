package flipkartsearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class UsingdataProvider {
	
	@DataProvider(name = "data1")
	
	public Object[][]testdata(){
		
		Object [] []data= new Object [7][1];
	    data [0][0]= "shoe";
		data [1][0]="tshirt";
		data [2][0]="tab";
		data [3][0]="pant";
		data [4][0]="roller";
		data [5][0]="shirt";
		data [6][0]="rose";
		return data;
	}
   @Test(dataProvider= "data1")  
	   public void  testcase1(String data) {
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  WebElement search= driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		  search.sendKeys(data + Keys.ENTER);
		  driver.close();
	   }
   }


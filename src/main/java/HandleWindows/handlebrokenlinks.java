package HandleWindows;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlebrokenlinks {
	public static void main(String[] args) throws InterruptedException, IOException,MalformedURLException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No of link:"+ links.size()); 
		//List <String>urlList =new ArrayList<String>();
		//for(WebElement e : links) {
		for(WebElement link:links) {
		String stringurl=	link.getDomAttribute("href");
		
		
		if(stringurl!=null && !stringurl.isEmpty()) {
			
			URL url= new URL(stringurl);
			HttpURLConnection connection =(HttpURLConnection )url.openConnection();
			connection.setRequestMethod("HEAD");
			connection.setConnectTimeout(2000);
			connection.setReadTimeout(2000);
			connection.connect();
			int httpresponse = connection.getResponseCode();
			if(httpresponse >=400) {
				System.out.println(stringurl +"--not valid url");
			}
				else {
					
					System.out.println(stringurl +"valid url");
				}
			}
			
			
		}
		
			
		}
			
		}
		
		 
		
		
	



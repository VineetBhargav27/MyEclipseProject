package multipledataProvider;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider
	public static Object[][] ninja(){
		
		Object[][] data= {{"seleniumpanda1@gmail.com","Selenium@123"},
                          {"seleniumpanda2@gmail.com","Selenium@123"},
                          {"seleniumpanda3@gmail.com","Selenium@123"}};
		return data;
	}
	@DataProvider
	public static Object[][] rediffmail(){
		
		Object[][] data= {{"seleniumpanda@rediffmail.com","Selenium@123"},
                          {"seleniumpanda2@rediffmaill.com","Selenium@123"},
                          {"seleniumpanda3@rediffmail.com","Selenium@1234"}};
		return data;
}
}

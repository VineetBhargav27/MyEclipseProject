package HandleWindows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class widowshandles {

	public static void main(String[] args) throws InterruptedException {
		
           WebDriverManager.chromedriver().setup();
           WebDriver driver= new ChromeDriver();
           driver.get("https://opensource-demo.orangehrmlive.com/");
           driver.manage().window().maximize();
           Thread.sleep(2000);
         //String windowID=  driver.getWindowHandle();
         //System.out.println(windowID);
         
         driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
       //for getWindowhandles()
                    Set<String> windowIds =driver.getWindowHandles();
                    //first Method- By using iterator()
                 /*Iterator <String> it= windowIds.iterator();
                 String parentwindowID=   it.next();
                 String childwindowID= it.next();
                 System.out.println("parentwindows:" +parentwindowID );
                 System.out.println("childwindows:" +childwindowID );*/
                    //second method  - using List/ArrayList
                    List<String> windowIdlist= new ArrayList(windowIds);//converting set to list
               /*String parentwindowid=windowIdlist.get(0);
               String childwindowid=windowIdlist.get(1);
               System.out.println("parentwindows:" +parentwindowid);
               System.out.println("childwindows:" +childwindowid);
               
               
               //how to use windowId's for switching
               
               driver.switchTo().window(parentwindowid);
               System.out.println("parentwindowid Title:"+ driver.getTitle());
               driver.switchTo().window(childwindowid);
               System.out.println("childwindow title:"+ driver.getTitle());*/
                    
              //using for loop 
            for(String winid:windowIdlist)  {
           String title= 	driver.switchTo().window(winid).getTitle();
           System.out.println(title);
           /*to close any windows
           if(title.equals("Human Resources Management Software | OrangeHRM"))
          driver.close();*/
            }
	
               
               
               
	}

}

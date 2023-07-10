package zdrivers;


import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      try(
      Scanner sc = new Scanner(System.in))
      {
    	 System.out.println("Which browser we want to open!!!"); 
    	  String browserValue = sc.next();
    	  if(browserValue.equalsIgnoreCase("chrome")) 
    	  {
    		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
              ChromeDriver driver = new ChromeDriver();
    	       driver.manage().window().maximize();
    	       Thread.sleep(2000);
    		    driver.close();
    	 }
    	  else if(browserValue.equalsIgnoreCase("firefox"))
    	  {
    		  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		      FirefoxDriver driver = new FirefoxDriver();
		      driver.manage().window().maximize();
		      Thread.sleep(2000);
		      driver.close();
    	  }
    	  else if(browserValue.equalsIgnoreCase("Edge"))
    			  {
    		  System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		      EdgeDriver driver = new EdgeDriver();
		      driver.manage().window().maximize();
		      Thread.sleep(2000);
		      driver.close();
    			  }
    	  else
    	  {
    		  System.out.println("Enter valid browser name");
    	  }
      }
    		  
	}

}

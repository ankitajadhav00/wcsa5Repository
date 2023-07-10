package qsp;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Rtp {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		try (// TODO Auto-generated method stub
	Scanner sc = new Scanner( System.in)) {
		System.out.println("Which browser we want to open");
		 String browserValue=sc.next();
		 if(browserValue.equalsIgnoreCase("ChromeBrowser"))
		 {
			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		}
		 else if(browserValue.equalsIgnoreCase("FireFoxBrowser"))
		 {
			 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			    FirefoxDriver driver = new FirefoxDriver();
			   driver.manage().window().maximize();
			   Thread.sleep(2000);
			   driver.close();
			   
		 }
		 else if(browserValue.equalsIgnoreCase("EdgeBrowser"))
		 {
			 System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
			   EdgeDriver driver= new EdgeDriver();
			   driver.manage().window().maximize();
			   Thread.sleep(2000);
			   driver.close();
		 }
	  }
   }
}
    
     
	
	



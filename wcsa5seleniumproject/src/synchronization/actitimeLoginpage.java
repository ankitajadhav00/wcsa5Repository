package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeLoginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver  =  new ChromeDriver();
		  driver.manage().window().maximize();
		 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//  WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(15));
		  driver.get("http://desktop-pgthev0/login.do");
		  String actualTitleOfLoginPage = driver.getTitle();
		 
		  
		  
	}
	

}

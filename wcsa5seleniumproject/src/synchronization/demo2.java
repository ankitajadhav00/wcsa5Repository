package synchronization;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver  =  new ChromeDriver();
		  driver.manage().window().maximize();
		 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//  WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(15));
		  driver.get("https://www.shoppersstack.com/");
		  
		  
	}

}

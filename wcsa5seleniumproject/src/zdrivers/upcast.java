package zdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upcast {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     Thread.sleep(2000);
	     driver.close();
	}

}

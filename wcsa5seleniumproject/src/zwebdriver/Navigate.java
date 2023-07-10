package zwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webDriver.chrome.driver","/Driver/chromedriver.exe");
	     WebDriver driver =new ChromeDriver();
	     driver.navigate().to("http://desktop-pgthev0/login.do");
	     Thread.sleep(2000);
	     driver.navigate().back();
	 	Thread.sleep(4000);
	 	driver.navigate().forward();
	 	Thread.sleep(3000);
	 	driver.navigate().refresh();
	 	Thread.sleep(2000);
	 	driver.close();
	}

}

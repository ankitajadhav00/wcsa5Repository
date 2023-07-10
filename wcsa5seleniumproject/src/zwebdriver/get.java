package zwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webDriver.chrome.driver","/Driver/chromedriver.exe");
	     WebDriver driver =new ChromeDriver();
	     driver.get("http://desktop-pgthev0/login.do");
	     Thread.sleep(2000);
	     driver.close();
	}

}

package zwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webDriver.chrome.driver","/Driver/chromedriver.exe");
	     WebDriver driver =new ChromeDriver();
	     Thread.sleep(2000);
	     driver.close();
	}

}

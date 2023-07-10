package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webDriver.chrome.driver","/Driver/chromedriver.exe");
     ChromeDriver driver =new ChromeDriver();
     Thread.sleep(2000);
     driver.close();
	}

}

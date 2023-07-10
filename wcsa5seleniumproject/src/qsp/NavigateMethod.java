package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver =	new ChromeDriver();
	driver.navigate().to("https://www.instagram.com/");
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

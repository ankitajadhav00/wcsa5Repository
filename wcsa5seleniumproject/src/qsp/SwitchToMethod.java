package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http:/www.instagram.com/");
	driver.switchTo().activeElement().sendKeys("selenium");
	}

}
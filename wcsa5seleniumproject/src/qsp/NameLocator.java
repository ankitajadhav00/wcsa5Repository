package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./driver/chromedriver");
		  ChromeDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://www.facebook.com");
	     WebElement pwd= driver.findElement(By.name("pass"));
	     pwd.sendKeys("qspider");
	      	
	}

}

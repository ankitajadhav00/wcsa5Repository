package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./driver/chromedriver");
		  ChromeDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com");
	     WebElement usn= driver.findElement(By.id("email"));
	     usn.sendKeys("qspider");
	      	
	}

}
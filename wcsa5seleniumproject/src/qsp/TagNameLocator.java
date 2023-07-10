package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      System.setProperty("webDriver.chrome.driver","./driver/chromedriver");
	  ChromeDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("file:///C:/Users/USER/Desktop/WCSA5/webelement/Username.html");
     WebElement usn= driver.findElement(By.tagName("input"));
     usn.sendKeys("qspider");
      	
   
	}

}

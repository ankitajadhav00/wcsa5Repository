package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtcitimeLocatorr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://190.210.184.180/login.do");
	       driver.findElement(By.name("username")).sendKeys("admin");
	       driver.findElement(By.name("pwd")).sendKeys("manager"); 
	       driver.findElement(By.id(" Login now ")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.linkText("logout")).click();
	          
	       
	    
	}

}

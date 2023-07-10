package Assignmentpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathassignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
                 System.setProperty("WebDriver.chrome.driver", "./drivers/chromedrivers.exe");               
                 ChromeOptions co = new ChromeOptions();
                 co.addArguments("--disable-notifications") ;                 
            WebDriver    driver    =  new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://spiceclub.spicejet.com/signup");
            Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Login']")).click();
                     
	}
 
}

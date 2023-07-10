package xPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcase1 {
//twitter
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
                  WebDriver driver  =  new ChromeDriver();
                  driver.manage().window().maximize();
                  driver.get("https://twitter.com/i/flow/login");
                  Thread.sleep(2000);
                  
                   driver.findElement(By.xpath("//input[@name='text']")).sendKeys("ankitajadhav@123gmail.com");
                   driver.findElement(By.xpath("//span[text()='next']")).click();
                   
                 
                 
                   
                   
	}

}

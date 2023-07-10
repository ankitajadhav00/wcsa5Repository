package xPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hplaptop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webDriver.chrome.driver","./drivers.chromedriver.exe");
      WebDriver driver  =  new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://www.flipkart.com/");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
      driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Hplaptop");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[contains(text(),'HP Omen Core i5 7th ')]/../..//div[text()='₹87,490']"));
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[text()='Processor']")).click();
      Thread.sleep(2000);
      
      
      
      
    		  
	}

}

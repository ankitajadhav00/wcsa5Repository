package actionclass;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver  =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://www.flipkart.com/");
      driver.findElement(By.xpath("//button[text()='✕']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
       Thread.sleep(2000);
       Thread.sleep(2000);
        WebElement target = driver.findElement(By.xpath("//div[text()='Mobiles']"));
        Thread.sleep(2000);
       Actions act = new Actions(driver);
       act.moveToElement(target).perform();
       
       
  
        
	}

}

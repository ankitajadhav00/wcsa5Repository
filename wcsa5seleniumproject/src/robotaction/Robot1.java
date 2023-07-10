package robotaction;

import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.flipkart.com/");
	      driver.findElement(By.xpath("//button[text()='✕']")).click();
	      
	     Robot robot= new Robot();
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_P);
	     
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_P);
	     Thread.sleep(2000);
	     
	     robot.keyPress(KeyEvent.VK_TAB);
	     robot.keyRelease(KeyEvent.VK_TAB);
	     
	     for(int i=0;i<=7;i++)
	     {
	    	 Thread.sleep(2000);
	    	  robot.keyPress(KeyEvent.VK_ENTER);
	 	     robot.keyRelease(KeyEvent.VK_ENTER);
	 	     
	    	 
	     }
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	    	 
	}

}

package robotaction;

import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmentonrobotaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		act.moveToElement(target).perform();
		
		
		driver.findElement(By.xpath("//a[text()='Band']"));
		
		
		
		 WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
		for(int i=1;i<=2;i++)
		{
		act.doubleClick(target2).perform();
		act.clickAndHold(target2).perform();
		}
	    Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	
	}

}

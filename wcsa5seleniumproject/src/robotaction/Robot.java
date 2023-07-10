package robotaction;

import java.awt.image.BandCombineOp;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions act = new Actions(driver);
	    act. moveToElement(target);
		
	
		WebElement Band = driver.findElement(By.xpath("//a[text()='Band']"));
		Robot robot=new Robot();
		for(int i=0;i<=2;i++)
		{
			
		}
		
		
	}

	public void keyPress(int vkControl) {
		// TODO Auto-generated method stub
		
	}

	public void keyRelease1(int vkControl) {
		// TODO Auto-generated method stub
		
	}

	public void keyRelease(int vkControl) {
		// TODO Auto-generated method stub
		
	}

	
	}



package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-pgthev0/login.do");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		boolean Verify = checkBox.isSelected();
	      System.out.println("Verify");
	      Thread.sleep(2000);
	      checkBox.isSelected();
	      Thread.sleep(2000);
	    boolean Verify1 =checkBox.isSelected();
	     System.out.println(Verify1);
	}

		
	}


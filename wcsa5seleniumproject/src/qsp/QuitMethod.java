package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=Open a popup window]")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}	
		
		
	}



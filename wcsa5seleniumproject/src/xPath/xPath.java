package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver  =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ankitaj30@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
        
      

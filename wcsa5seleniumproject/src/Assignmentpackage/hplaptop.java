package Assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hplaptop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver  =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("ankitajadhav3042000@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Hplaptop");
        Thread.sleep(2000);
        driver.findElement(By.xpath("")).click();
	}

        
       
        
        
        
        
	}


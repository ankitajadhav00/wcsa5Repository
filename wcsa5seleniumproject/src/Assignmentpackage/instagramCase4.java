package Assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramCase4 {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
	        WebDriver driver  =  new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.instagram.com/");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("9325692023");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("anku3009");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[contains(@class,'x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1')]")).click();
	        	
	}

}

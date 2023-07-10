package Assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapChat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://accounts.snapchat.com/accounts/v2/login");
	       driver.findElement(By.id("accountIdentifier")).sendKeys("ankitajadhav3042000@gmail.com");
	    
	       driver.findElement(By.className("//button[@class='btn  btn-lg btn-default']")).click();;
		}

	}



package Assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.linkedin.com/login");
	       driver.findElement(By.id("username")).sendKeys("ankitajadhav3042000@gmail.com");
	       driver.findElement(By.id("password")).sendKeys("12345678");
	       driver.findElement(By.className("//button[@class='btn__primary--large from__button--floating']")).click();;
		}

	}



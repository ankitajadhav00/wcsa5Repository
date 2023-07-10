package Assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.netflix.com/in/login");
       driver.findElement(By.id("id_userLoginId")).sendKeys("ankitajadhav3042000@gmail.com");
       driver.findElement(By.id("id_password")).sendKeys("12345678");
       driver.findElement(By.xpath("//btn login-button btn-submit btn-small"));
	}

}

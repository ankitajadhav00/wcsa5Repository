package zlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://desktop-pgthev0/login.do");
	       driver.findElement(By.name("username")).sendKeys("admin");
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	       driver.findElement(By.id("loginButton")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.linkText("logout")).click();
	}

}

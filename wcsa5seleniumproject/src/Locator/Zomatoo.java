package Locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.zomato.com/india");
	       // To click on signUp page
	       driver.findElement(By.name("text")).click();
	       
	       driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("ankitajadhav3042000@gmail.com");
	       
	       driver.findElement(By.className("sc-ileJJU fhCIbg")).sendKeys("123445");
	       
	}

}

package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocatorNamee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https:www.google.com");
	       
		driver.switchTo().activeElement().sendKeys("Joey Tribbiani",Keys.ENTER);
		driver.findElement(By.className("yKMVIe"));
}
}
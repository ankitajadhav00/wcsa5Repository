package zlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/login/");
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("qspider");
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector("input[class$='_9npi']")).sendKeys("qspider");
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector("button[name='login']")).click();
	       
	       
	}

}

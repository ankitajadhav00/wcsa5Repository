package zwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.Driver","/.drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-pgthev0/login.do");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	//	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	WebElement usnTB = driver.findElement(By.xpath("//input[@name='username']"));
	     usnTB.sendKeys("admin");
	  WebElement pwdTB = driver.findElement(By.xpath("//input[@name='pwd']"));
	    pwdTB.sendKeys("manager");
	}

}

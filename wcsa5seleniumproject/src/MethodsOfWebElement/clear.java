package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.Driver","/.drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-pgthev0/login.do");
		
		//by using method chaining
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).clear();
		
		
		
	//By using create variable	
	//WebElement usnTB = driver.findElement(By.name("username"));
     // usnTB.sendKeys("admin");
   // WebElement pwdTB = driver.findElement(By.name("pwd"));
    	//pwdTB.sendKeys("manager");
    	//Thread.sleep(2000);
    	//usnTB.clear();
    	//pwdTB.clear();
		
		
		
		
		
	}
	
    	
	}



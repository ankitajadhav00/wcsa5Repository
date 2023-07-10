package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Instagram{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9324692023");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_acan _acao _acat _aj1-']"));
		

	}

}

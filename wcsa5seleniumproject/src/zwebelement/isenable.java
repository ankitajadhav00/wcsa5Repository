package zwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.Driver","/.drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcdewfgt");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
	boolean button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).isEnabled();
		System.out.print(button);
	}

}

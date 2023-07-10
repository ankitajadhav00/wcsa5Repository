package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

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
	       // home page
	       new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
	       // click on setting module
	      driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
	      // click on logo and colour
	      driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	      // click on custom logo
	      driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
WebElement file = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
Actions act = new Actions(driver);
	   act.doubleClick(file).perform();
	   
	   
	      
	      
	      
	}

}

package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.Driver","/.drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-pgthev0/login.do");
	WebElement checkBox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
	boolean Verify = checkBox.isSelected();
      System.out.println("Verify");
      Thread.sleep(2000);
      checkBox.isSelected();
      Thread.sleep(2000);
    boolean Verify1 =checkBox.isSelected();
     System.out.println(Verify1);
	}

}


	


     
	





     
 
      
      



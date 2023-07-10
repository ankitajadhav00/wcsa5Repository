package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSubmit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver  =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("9325692023");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("anku3009");
      WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
      loginButton.submit();
	}

}

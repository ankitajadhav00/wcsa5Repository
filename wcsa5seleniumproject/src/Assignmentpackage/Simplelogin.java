package Assignmentpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simplelogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/USER/Desktop/WCSA5/webelement/simplelogin.html");
        Thread.sleep(2000);
        driver.findElement(By.linkText("username")).sendKeys("admin");
        Thread.sleep(2000);
	    driver.findElement(By.linkText("password")).sendKeys("manager");
	    
	    

}
	
}

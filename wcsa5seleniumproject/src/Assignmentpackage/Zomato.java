package Assignmentpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.zomato.com/india");
	       // To click on signUp page
	       driver.findElement(By.linkText("signUp")).click();
	       
	       driver.findElement(By.className("sc-1yzxt5f-4 ioJwpZ")).sendKeys("ankitajadhav3042000@gmail.com");
	       
	       driver.findElement(By.className("sc-eqPNPO hckVZi")).sendKeys("123445");
	       


}
}
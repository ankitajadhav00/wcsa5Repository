package dropdown1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectbyvisibletext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/USER/Desktop/WCSA5/webelement/multipleOptionsMultiselectDropdown.html");
		WebElement multiselectDD = driver.findElement(By.name("menu"));
		Select sel=new Select(multiselectDD);
		sel.selectByVisibleText("momos");

	}

}

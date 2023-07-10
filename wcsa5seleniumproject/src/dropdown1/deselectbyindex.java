package dropdown1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectbyindex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/USER/Desktop/WCSA5/webelement/multipleOptionsMultiselectDropdown.html");
		// identify DropDown
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		//handle DropDown
		Select sel = new Select(dropDownElement);
		Thread.sleep(2000);
		// deselectByIndex
		//sel.selectByIndex(2);
	//	Thread.sleep(2000);
	//	sel.deselectByIndex(2);
	//	Thread.sleep(2000);
		//deselectByVisibleText
		
	//	sel.selectByVisibleText("Vadapav");
	//	Thread.sleep(2000);
	//	sel.deselectByValue("momos");
	//	Thread.sleep(2000);
		//deselectByValue
		sel.selectByValue("v1");
			Thread.sleep(2000);
			sel.deselectByValue("v4");
		Thread.sleep(2000);;
	}

}

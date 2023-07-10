package dropdown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/USER/Desktop/WCSA5/webelement/Dropdownmultiple.html");
		// identify DropDown
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		//handle DropDown
		Select sel = new Select(dropDownElement);
	   WebElement allOpts = sel.getWrappedElement();
	      System.out.println(allOpts.getText());
	      
	    	
	    	
		
	}
	}



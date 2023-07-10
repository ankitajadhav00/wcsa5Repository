package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
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
		//select multiple options from dropdown
		for (int i=2;i<=5;i++) {
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
			
		//to read all selected option from dropDown
	List<WebElement> allOps = sel.getAllSelectedOptions();
//	for(WebElemenet op:allOps){
//	Thread.sleep(2000);
//	System.out.println(op.getText());


	
	for( int i=0;i<allOps.size();i++) {
		Thread.sleep(2000);
		System.out.println(allOps.get(i).getText());
		
		
		}
		 
		  
		 
		  
	}

}

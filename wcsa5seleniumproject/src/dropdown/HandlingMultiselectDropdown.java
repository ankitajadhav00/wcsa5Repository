package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/USER/Desktop/WCSA5/webelement/Dropdownmultiple.html");
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		                        Select sel = new Select(multiselectDD);
		                       sel.selectByIndex(1);
		                         
		                          
//	WebElement multiselectDD = driver.findElement(By.id("menu"));
	//	 	                      Select sel = new Select(multiselectDD);
	//	                         sel.selectByVisibleText("Vadapav");
		                         
		               //         WebElement multiselectDD = driver.findElement(By.id("menu"));
		 	            //          Select sel = new Select(multiselectDD);
		               //       sel.selectByValue("v5");
		                        
		                         
		// To DeSelect Using Index
		 //    sel.deselectByIndex(1);
		     
		 //  to DeSelct Using By visibleText  
		  //   sel.deselectByVisibleText("Vadapav");
		     
		// To DeSelect by using deSelectByValue
		     sel.deselectByValue("v5");
		     
		     //  To Select Multiple Options
		//   for(int i=0;i<5;i++)  {
		//	   sel.selectByIndex(i);
			   Thread.sleep(2000);
		   

for(int i=0;i<5;i++) {
	sel.deselectByIndex(i);
	Thread.sleep(2000);
}

	}
	
	
}

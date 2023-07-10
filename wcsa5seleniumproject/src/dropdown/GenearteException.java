package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenearteException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.get("file:///C:/Users/USER/Desktop/WCSA5/webelement/Dropdownsingle.html");
         //Identifying DropDown On Web Page
    WebElement dropDownElement = driver.findElement(By.id("menu"));
    //handle dropDown by creating object of select...
        Select  sel   = new Select(dropDownElement);
     // Select The Options From dropDown
        // Use Selection Methods
        sel.selectByIndex(2);// from single select DropDown
        //try to deselect given options from DropDown
        sel.deselectByIndex(2);
        
        
              
    
         
	}

}

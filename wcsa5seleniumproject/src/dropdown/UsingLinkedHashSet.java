package dropdown;

import java.time.Duration;
import java.util.List;
import java.util.LinkedHashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingLinkedHashSet {

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
		     LinkedHashSet<String>LHS= new LinkedHashSet<String>();
		   
		// to get options from dropDown
		       List<WebElement> allopts = sel.getOptions();
		 // to read options from dropdown
		       for (int i=0;i<allopts.size();i++) {
		     WebElement op = allopts.get(i);
		     String value=op.getText();
		     //add value into set will duplicates not allowed
		     LHS.add(value);
		     
		       }
		       // read the value from set
		       for (String element:LHS) {
		    	   Thread.sleep(2000);
		    	 System.out.println(element)  ;
		       }
	}
	
	}



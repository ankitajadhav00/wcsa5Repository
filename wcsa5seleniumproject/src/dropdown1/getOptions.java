package dropdown1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) throws InterruptedException {
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
       // Read all the options from DropDown
     List<WebElement> allOps = sel.getOptions();
     // To Read List use looping statement
     for(WebElement op:allOps) {
   	  Thread.sleep(2000);
   	if(op.getText().equals("pizza")){
   		op.click();
   		break;        		
		      
   	}


	}
	}
}
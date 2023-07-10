package dropdown;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/USER/Desktop/WCSA5/webelement/Dropdownmultiple.html");
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		 Select sel = new Select(multiselectDD);
		 // IsMultipleMethod
		boolean result = sel.isMultiple();
		System.out.println(result);
		            //getDropDownOPtionsMethod
		List<WebElement>DropdownOptions = sel.getOptions();
		for(int i=0;i<DropdownOptions.size();i++) {
			String Options =DropdownOptions.get(i).getText();
			System.out.println(DropdownOptions);
			Thread.sleep(2000);
		}
		System.out.println();
	

}
	
}


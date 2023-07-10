package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/USER/Desktop/WCSA5/webelement/multipleOptionsMultiselectDropdown.html");
		// identify DropDown
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		Select sel=new Select(dropDownElement);
		for(int i=2; i<=5;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
			
		}
		List<WebElement> allOps = sel.getAllSelectedOptions();
		
		{
			Thread.sleep(2000);
			WebElement op = null;
			System.out.println(op.getText());
		}
		for(int i=0; i<allOps.size();i++);
		{
			Thread.sleep(2000);
			int i = 0;
			System.out.println(allOps.get(i).getText());
			}
	}
}

	


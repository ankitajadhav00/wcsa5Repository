package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	Dimension size = new Dimension(100,100);
	driver.manage().window().setSize(size);
	
	  
		
		
		

	}

}
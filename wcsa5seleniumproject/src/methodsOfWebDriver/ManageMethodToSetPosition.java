package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./driver.chromedriver.exe");
                 ChromeDriver driver = new ChromeDriver();
                  Point point = new Point(50,100);
                  driver.manage().window().setPosition(point);
                  
                    
                  
	}

}

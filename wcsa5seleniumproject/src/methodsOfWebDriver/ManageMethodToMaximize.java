package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToMaximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chromedeiver","./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
     driver.close();
     driver.manage().window().maximize();
     

	}

}

package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
Thread.sleep(2000);
driver.close();


 
	}

}

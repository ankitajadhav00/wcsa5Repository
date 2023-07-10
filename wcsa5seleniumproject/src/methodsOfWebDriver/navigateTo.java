package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigateTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
                        ChromeDriver driver = new ChromeDriver();
                        driver.navigate().to("https://www.goggle.com");
                        Thread.sleep(2000);
                        driver.navigate().back();
                        Thread.sleep(2000);
                        driver.navigate().forward();
                        Thread.sleep(2000);
                        driver.navigate().refresh();
                        Thread.sleep(2000);
                        driver.get("https://www.gogle.com");
                        driver.switchTo().activeElement().sendKeys("selenium");
                        
                        
		
	}

}

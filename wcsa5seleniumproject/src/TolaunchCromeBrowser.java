import org.openqa.selenium.chrome.ChromeDriver;

public class TolaunchCromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver","./drivers/chromedrivers.exe");
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.close();
        
           
	}

}

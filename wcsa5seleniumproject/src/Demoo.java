import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.Driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://190.210.184.180/login.do");
		
		Thread.sleep(2000);
		
driver.close();
	}

}

package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class eventfiringwebdriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-pgthev0/login.do");
		
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		File src = efw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/ssway5.jpg");
		Files.copy(src,dest);
	}

}

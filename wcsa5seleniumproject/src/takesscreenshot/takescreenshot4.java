package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import org.openqa.selenium.OutputType;
//upcast into remotewebdriver class

public class takescreenshot4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver");
		RemoteWebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/downloads/");
		
	    File src =driver.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./screenshots/screenshot4.png");
	    Files.copy(src, dest);
	                		
	}

}

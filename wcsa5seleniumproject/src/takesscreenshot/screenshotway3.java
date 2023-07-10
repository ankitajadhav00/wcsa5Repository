package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshotway3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver");
		ChromeDriver cdriver = new ChromeDriver();
		
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cdriver.get("https://www.selenium.dev");
		File src = cdriver.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		       File dest = new File("./screenshots/screenshot3.jpg");
		       Thread.sleep(2000);
		       Files.copy(src, dest);
		
		
	}

}

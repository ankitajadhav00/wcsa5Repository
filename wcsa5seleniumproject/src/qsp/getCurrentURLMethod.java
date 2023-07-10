package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentURLMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webDriver.chrome.driver","/Driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https:/www.instagram.com/");
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
	}

}

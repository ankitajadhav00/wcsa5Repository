package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSourceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webDriver.chrome.driver","/Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https:/www.instagram.com/");
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}

}

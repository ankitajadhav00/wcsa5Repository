package zwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Managemethodtomaximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","/Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	}

}

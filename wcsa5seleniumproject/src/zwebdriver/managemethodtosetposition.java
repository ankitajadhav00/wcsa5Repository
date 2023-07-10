package zwebdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class managemethodtosetposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","/Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		Point point = new Point(400,500);
		driver.manage().window().setPosition(point);
	}
	}



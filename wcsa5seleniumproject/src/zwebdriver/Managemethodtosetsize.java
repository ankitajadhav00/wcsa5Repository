package zwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managemethodtosetsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     Dimension d=new Dimension(500, 600);
	     driver.manage().window().setSize(d);
	      
	     
	     //ChromeDriver driver = new ChromeDriver();
			Dimension size=new Dimension(500,400);
			driver.manage().window().setSize(size);
			
			
	}

}

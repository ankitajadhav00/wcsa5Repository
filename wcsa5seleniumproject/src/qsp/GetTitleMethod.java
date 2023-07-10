package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webDriver.chrome.driver","./drivers/chrome.driver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.instagram.com/");
      String pageTitle=driver.getTitle();
      System.out.println(pageTitle);
	}

}

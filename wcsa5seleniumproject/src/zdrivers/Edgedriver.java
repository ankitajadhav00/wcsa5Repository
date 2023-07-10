package zdrivers;


import org.openqa.selenium.edge.EdgeDriver;

public class Edgedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     new EdgeDriver();
	}

}

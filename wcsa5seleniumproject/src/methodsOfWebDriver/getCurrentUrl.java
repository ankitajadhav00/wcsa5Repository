package methodsOfWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./C:\\Users\\USER\\Desktop\\WCSA5/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com");
		  String currentUrl=driver.getCurrentUrl();
		  System.out.println(currentUrl);
		  		
		  
		  
		        
	
		  
		  


}
}
package zwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.Driver","/.drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
	Point newsElement = driver.findElement(By.xpath("//h2[text()='News']")).getLocation();
		int xaxis=newsElement.getX();
		int yaxis=newsElement.getY();
		System.out.println("x axis of news webelement:"+xaxis+"y axis of news webelement:"+yaxis);
	}

}

package jmeter;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loadTest {
	
	@Test
	public void testing()
	{
		System.setProperty("webdriver.chrome.driver", "C://Leena/selenium_drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		
		
	}
	
	

}

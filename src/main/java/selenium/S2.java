package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basics.Methods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class S2 {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "F:\\Vishnu Tej\\chromedriver_Version 83.0.4103.97\\chromedriver_83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(("https://www.amazon.in/"));
		//driver.navigate().to("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		

	}

}

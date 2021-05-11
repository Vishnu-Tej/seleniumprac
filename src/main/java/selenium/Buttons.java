package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","F:\\Vishnu Tej\\chromedriver Version 86.0.4240.111.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("htttps://google.com");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		

	}

}

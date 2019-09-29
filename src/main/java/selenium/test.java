package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Vishnu Tej\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		

	}

}

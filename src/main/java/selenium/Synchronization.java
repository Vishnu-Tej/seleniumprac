package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Synchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Vishnu Tej\\chromedriver_Version 83.0.4103.97\\chromedriver_83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.titleContains(""));
		System.out.println(driver.getTitle());
		

	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hublogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		// 1st method
		// driver.findElement(By.id("username")).sendKeys("test@Automation");

		// 2nd method
		// WebElement email = driver.findElement(By.id("username"));
		// email.sendKeys("test@automate");

		// 3rd method
		By email = By.id("username");
		WebElement emailElement = driver.findElement(email);
		emailElement.sendKeys("@autotest");
		}

	  	public static WebElement getElement(WebDriver driver ,By locator){
		WebElement element = driver.findElement(locator);
		return element;
		}
	
         	
	

}

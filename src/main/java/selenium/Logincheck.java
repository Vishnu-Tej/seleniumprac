package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logincheck {
	
	@Test
	public void login()
	{
		//System.setProperty("webdriver.chrome.driver", "F:\\Vishnu Tej\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("username")).sendKeys("Test@gmil.com");
		driver.findElement(By.id("password")).sendKeys("Admin9876");
		
		//driver.findElement(By.id("password-login-button")).click();
	}

}

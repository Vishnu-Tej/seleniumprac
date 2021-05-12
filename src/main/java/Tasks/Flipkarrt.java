package Tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author acer
 *
 */
public class Flipkarrt {
WebDriver driver;
Properties p;
public static String browser;
	
	@BeforeTest
	public void setup(){
		String browser = p.getProperty("browser");
		if(browser.equals("chrome")){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	else if (browser.equals("firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
		
		}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
	
	@Test
	public void mobile(){
		try {
			FileInputStream f = new FileInputStream("C:/Users/acer/workspace/practise/src/main/java/config/config.properties");
			p = new Properties();
			p.load(f);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.out.println(e1);
		} catch (IOException e2) {
			e2.printStackTrace();
			System.out.println(e2);
		}
		driver.findElement(By.xpath(p.getProperty("un"))).sendKeys("username");
		driver.findElement(By.xpath(p.getProperty("pwd"))).sendKeys("password");
		driver.findElement(By.xpath(p.getProperty("button"))).click();
		WebElement electronics = driver.findElement(By.className("xtXmba"));
		Actions action = new Actions(driver);
		action.moveToElement(electronics).build().perform();
		action.click(electronics);		
		
	}
	
	
	
	
}


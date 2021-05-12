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
public class Flipkart {
	public static WebDriver driver;
	public static Properties prop;
	public static String Browser;
	
	@BeforeTest
	public void setup(){
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		/*WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();*/

	}
	@Test
	public void mobile(){
				
		try {
			FileInputStream f = new FileInputStream("C:/Users/acer/workspace/practise/src/main/java/config/config.properties");
			prop = new Properties();
			prop.load(f);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.out.println(e1);
		} catch (IOException e2) {
			e2.printStackTrace();
			System.out.println(e2);
		}
		
		
		driver.findElement(By.xpath(prop.getProperty("un"))).sendKeys("username");
		driver.findElement(By.xpath(prop.getProperty("pwd"))).sendKeys("password");
		driver.findElement(By.xpath(prop.getProperty("button"))).click();
		
		WebElement electronics = driver.findElement(By.className("xtXmba"));
		Actions action = new Actions(driver);
		action.moveToElement(electronics).build().perform();
		action.click(electronics);
 
		//driver.findElement(By.xpath("//input[@type='text'and @title='Search for products, brands and more']")).sendKeys("mi");
		/*WebElement audiolink = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		action.moveToElement(audiolink).build().perform();
		action.click(audiolink);*/
          	
		}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}

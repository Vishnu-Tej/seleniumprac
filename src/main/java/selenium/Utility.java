package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	
	public static WebDriver browser(WebDriver driver,String browsername){
		if(browsername.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else{
			System.out.println("Invalid Browser");
		}
		return driver;
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver,By locator){
		WebElement element = driver.findElement(locator);
		return element;
	}
	public static void closeBrowser(WebDriver driver){
		driver.quit();
	}
	public static String getTitle(WebDriver driver){
		String title = driver.getTitle();
          return title;	
	}
	public static void doClick(WebDriver driver,By locator){
		driver.findElement(locator);
	}
	public static void launchUrl(WebDriver driver, String url){
		driver.get(url);
	}

}

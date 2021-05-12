package Tasks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class util {
	public static WebDriver driver;
	public static String browser;
	public static Properties prop;
	
	public static void launchBrowser(){	
		
		//String browser = prop.getProperty("browser");
		if(browser.equals("chrome")){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	else if (browser.equals("firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	
	}
	
}

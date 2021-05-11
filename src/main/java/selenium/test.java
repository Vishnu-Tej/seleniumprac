package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.modifier.SynchronizationState;

public class test {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\Vishnu Tej\\chromedriver Version 86.0.4240.111.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new WebDriver();//we can't create the object of the interface.can't instantiate the type WebDriver
		driver.get("https://app.hubspot.com/login");
		//System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals( "Checking browser")){
			System.out.println("title is correct");
		}
		else{
			System.out.println("wrong title");
		}
		driver.quit();
	}

}

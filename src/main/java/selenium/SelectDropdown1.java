package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Vishnu Tej\\chromedriver_Version 83.0.4103.97\\chromedriver_83.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 WebElement day = driver.findElement(By.id("day"));
		 Select select1 = new Select(day);
		 List<WebElement> daylist = select1.getOptions();
		 System.out.println(daylist);
	}

}

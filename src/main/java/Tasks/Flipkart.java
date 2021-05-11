package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver;
	
	@Test
	public void mobile(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9100405914");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("vishhu4all");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		WebElement electronics = driver.findElement(By.className("xtXmba"));
		Actions action = new Actions(driver);
		action.moveToElement(electronics).build().perform();
		action.click(electronics);

		//WebElement audiolink = driver.findElement(By.className("_6WOcW9 _2-k99T"));
		//_6WOcW9 _2-k99T
		////*[@id="container"]/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]
		
		//action.moveToElement(audiolink).build().perform();
		//action.click(audiolink);
          	
		
		
		
	}
}

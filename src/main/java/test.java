import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","‪C:\\Users\\acer\\Desktop\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.className("active makeFlex hrtlCenter column")).click();
		driver.quit();
		
		

	}

}

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Vishnu Tej\\chromedriver_Version 83.0.4103.97\\chromedriver_83.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	   List<WebElement> links = driver.findElements(By.tagName("a"));
	   System.out.println(links.size());
	   
	   for (int i=0;i<links.size();i++){
		   String linksText = links.get(i).getText();
		   /*if(!linksText.contentEquals(" ")){
			   System.out.println(linksText);
		   }*/
		   if(!linksText.isEmpty()){
			   System.out.println(linksText);
			   
		   }
		   
	   }
	   
	    

	}

}

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricketscorelist {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/19430/scorecard/1188628/west-indies-vs-india-1st-test-icc-world-test-championship-2019-2021");
		
		//h2[text()='India 1st Innings ']
		//(//span[contains(text(),'Scorecard')])[3]--->scorecardlink
		driver.findElement(By.xpath("//h2[text()='India 1st Innings ']")).click();
		
		//first batsmen name-->  (//a[contains(text(),'KL Rahul')])[1]
		// common class name-->  cell runs
		//(//a[contains(text(),'KL Rahul')])[1]//parent::div//following-sibling::div[@class='cell runs']-->xpath
		
		/*List<WebElement>Score = driver.findElements(By.xpath("(//a[contains(text(),'KL Rahul')])[1]//parent::div//following-sibling::div[@class='cell runs']"));
		System.out.println(Score.size());
		for(int i=0;i<Score.size();i++){
			System.out.println(Score.get(i).getText());
		}*/
		
			
		getIndScoreBoard(driver,"KL Rahul");
		getIndScoreBoard(driver,"MA Agarwal");
	}
	
	//generic method:
	public static void getIndScoreBoard(WebDriver driver ,String Playername){
		List<WebElement>Score = driver.findElements(By.xpath("(//a[contains(text(),'"+Playername+"')])[1]//parent::div//following-sibling::div[@class='cell runs']"));
		System.out.println(Score.size());
		for(int i=0;i<Score.size();i++){
			System.out.println(Score.get(i).getText());
		}
	}

}

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricketscoreboard {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/19430/scorecard/1188628/west-indies-vs-india-1st-test-icc-world-test-championship-2019-2021");
		//driver.findElement(By.xpath("//h2[text()='India 1st Innings ']")).click();
		
		List<WebElement> playerslist = driver.findElements(By.xpath("//a//parent::div[@class='cell batsmen']//a[@name='&lpos=cricket:game:scorecard:player']"));
		System.out.println(playerslist.size());//gives total size 41
		for(int i=0;i<11;i++){
			getIndScoreBoard(driver,playerslist.get(i).getText());
		}
			
	}
	public static void getIndScoreBoard(WebDriver driver,String Playername){
		System.out.println("\n");
		List<WebElement>Score = driver.findElements(By.xpath("(//a[contains(text(),'"+Playername+"')])[1]//parent::div//following-sibling::div[@class='cell runs']"));
		for(int i=0;i<Score.size();i++){
		System.out.print(Score.get(i).getText() + "\t");
		}
		System.out.println();
	}
}

//xpath for players:
		//-->1 (//a[contains(text(),'KL Rahul')])[1]//parent::div[@class='cell batsmen']
		//--->2 (//a[contains(text(),'KL Rahul')])[1]//parent::div[@class='cell batsmen']//a[@name='&lpos=cricket:game:scorecard:player']-->giving only single value
		//-->3 //parent::div[@class='cell batsmen']//a[@name='&lpos=cricket:game:scorecard:player']
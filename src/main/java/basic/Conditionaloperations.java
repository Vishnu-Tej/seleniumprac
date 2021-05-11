package basic;

import java.lang.invoke.SwitchPoint;

import org.aspectj.apache.bcel.generic.SwitchBuilder;

public class Conditionaloperations {

	public static void main(String[] args) {
		
		String browser = "chrome";
		
//this method checks all the "if" conditions even if it finds matched condition 		
		if(browser.equals("chrome")){
			System.out.println("launch chrome");
		}
		if(browser.equals("firefox")){
			System.out.println("launch firesfox");
		}
		if(browser.equals("IE"))
		{
			System.out.println("launch IE");
		}
		/*else{
			System.out.println("browser name is invalid " + browser);
		}*/

//this method checks conditions from top to bottom	when the condition gets satisfied,
//it stops checking other conditions
		if(browser.equals("chrome")){
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")){
			System.out.println("launch firefox");
		}
		else if (browser.equals("IE")){
			System.out.println("launch IE");
		}
		else{
			System.out.println("invalid browser name " + browser);
		}
		
//In above method also there is one drawback,if there are 50 conditions and matched condition is at 40th position
//then it will check all 40 conditions.	
		
//so to overcome this we use "switch case".where it jumps directly to given condition.
//here ifit chrome ,then it directly goes to chrome case and executes.
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch chrome");
			break;
		case "IE":
			System.out.println("launch chrome");
			break;

		default:
			System.out.println("invalid browser " + browser);
			break;
		}
				
	boolean flag = true;
	if(flag){
		System.out.println("pass");
	}
	else{
		System.out.println("fail");
	}
		
		
	}

}

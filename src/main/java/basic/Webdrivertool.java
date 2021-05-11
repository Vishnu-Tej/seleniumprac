package basic;

public class Webdrivertool {
	public void chromebrowser(){
		System.out.println("checking browser name");
		System.out.println("checkig browser version");
		System.out.println("opening the browser");
	}
	public void firefoxbrowser(){
		System.out.println("checking browser name");
		System.out.println("checkig browser version");
		System.out.println("opening the browser");
	}

	
		public void launchbrowser(String browser){
			if(browser.equals("chrome")){
				System.out.println("launch chrome browser");
			}
			else if(browser.equals("Firefox")){
				System.out.println("launch firefox browser");
			}
			else{
				System.out.println("Invalid Browser");
			}
		}

	}



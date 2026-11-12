package Hooks;
import baseclass.Base;
import io.cucumber.java.Before;
import io.cucumber.java.After;


public class Hooksclass extends Base {
	@Before

	public void StartBrowser() {
	chromeOption();
	
	}
	 
	@After
	public void closeBrowser() {
		if(driver != null) {
	driver.quit();
	driver= null;
	}
		
		}
}

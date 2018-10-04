package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class lTest7 {

	public static void main(String[] args) {
		
		//invoke .exe file
		System.setProperty("webdriverchrome.driver", "driver\\Chromedriver.exe");
				
		//Create driver object for chrome browser
		//Class name = ChromeDriver
		ChromeDriver driver = new ChromeDriver();
				
		//Go to url : Findmyfare
		driver.get("https://www.facebook.com/");
		
	
		//CSS :tagName[attribute='value']
		driver.findElementByCssSelector("input[name='email']").sendKeys("Testuser");
		//or :#value
		driver.findElementByCssSelector("#email").sendKeys("Testuser");
		//or :tagName#value
		driver.findElementByCssSelector("input#email").sendKeys("Testuser");

	}

}

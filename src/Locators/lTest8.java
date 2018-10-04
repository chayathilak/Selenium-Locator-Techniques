package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class lTest8 {

	public static void main(String[] args) {
		
		//invoke .exe file
		System.setProperty("webdriverchrome.driver", "driver\\Chromedriver.exe");
						
		//Create driver object for chrome browser
		//Class name = ChromeDriver
		ChromeDriver driver = new ChromeDriver();
						
		//Go to url : Findmyfare
		driver.get("https://www.facebook.com/");
		
		//tagName[contains(@attribute,'value')]
		driver.findElementByXPath("//input[contains(@name,'email')]").sendKeys("Usertest");
		driver.findElementByXPath("//*[contains(@id,'pass')]").sendKeys("test");
		
		//clear text box
		driver.findElementByXPath("//input[contains(@name,'email')]").clear();
		driver.findElementByXPath("//*[contains(@id,'pass')]").clear();
		
		//CSS --> tagName[Attribute*='value']
		driver.findElementByCssSelector("input[name*='email']").sendKeys("CSStest");

	}

}

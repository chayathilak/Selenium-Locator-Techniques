package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class lTest3 {

	public static void main(String[] args) {
		
		//invoke .exe file
		System.setProperty("webdriverchrome.driver", "driver\\Chromedriver.exe");
				
		//Create driver object for chrome browser
		//Class name = ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Go to url : facebook.com
		driver.get("https://www.facebook.com/");
		
		//two fields with same ClassName,selenium capture only the first field 
		driver.findElementByClassName("inputtext").sendKeys("Test123@gmail.com");
		driver.findElementByClassName("inputtext").sendKeys("test456");
		
		//Get element by xpath
		driver.findElementByXPath("//*[@id=\'pass\']").sendKeys("test789");
		
		//Locate element using css selector
		driver.findElementByCssSelector("#email").sendKeys("123456789");
		
	
	}

}

package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class lTest2 {

	public static void main(String[] args) {
		
		//invoke .exe file
		System.setProperty("webdriverchrome.driver", "driver\\Chromedriver.exe");
				
		//Create driver object for chrome browser
		//Class name = ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Go to url : salesforce.com
		driver.get("https://login.salesforce.com/?locale=eu");
		
		//Selenium will not accept the class names with spaces
		//driver.findElementByClassName("input r4 wide mb16 mt8 username").sendKeys("TestUsername");
		
		//Get text from the web site and print it in the console
		System.out.println(driver.findElementByXPath("//*[@id=\"login_form\"]/div[3]/label").getText());
		
	}

}

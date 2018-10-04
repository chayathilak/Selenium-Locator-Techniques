package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class lTest6 {

	public static void main(String[] args) {
		
		//invoke .exe file
		System.setProperty("webdriverchrome.driver", "driver\\Chromedriver.exe");
		
		//Create driver object for chrome browser
		//Class name = ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Go to url : Findmyfare
		driver.get("https://www.facebook.com/");
		
		//XPath with starts-with ://tag[starts-with(@attribute,'value')]
		driver.findElementByXPath("//input[starts-with(@id,'email')]").sendKeys("test123SSS");
		
		//multiple relative XPath declarations with "//" double slash : //div[@class='form-group']//input[@id='user-message']
		driver.findElementByXPath("//div[@class='menu_login_container rfloat _ohf']//input[@id='email']").sendKeys("test123SSS@gmail.com");
		
		//"or" condition : //tag[XPath Statement-1 or XPath Statement-2]
		driver.findElementByXPath("//*[@type='password' or @id='pass']").sendKeys("test999");
		
		//"and" condition : //tag[XPath Statement-1 and XPath Statement-2]
		driver.findElementByXPath("//*[@id='email' and @class='inputtext']").clear();
		
		//XPath with text() : //tag[text()='text value']
		driver.findElementByXPath("//a[text()='Forgotten account?']").click();
		

	}

}

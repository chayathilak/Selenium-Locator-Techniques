package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class lTest4 {

	public static void main(String[] args) {
		
		//invoke .exe file
		System.setProperty("webdriverchrome.driver", "driver\\Chromedriver.exe");
				
		//Create driver object for chrome browser
		//Class name = ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Go to url : Findmyfare
		driver.get("https://www.findmyfare.com/account/register");
		
		//Regular expression : //tagName[@attribute='value']
		//<input type="text" name="email" value="" id="email">
		driver.findElementByXPath("//input[@name='email']").sendKeys("zzzzzz");
		        
		//<a href="https://www.findmyfare.com/account/login">Existing User ? Sign in here </a>
		driver.findElementByXPath("//a[@href='https://www.findmyfare.com/account/login']").click();
		
		//<img src="https://fmffiles.s3.amazonaws.com/site-v7/logo/logo.png" alt="Findmyfare">
		driver.findElementByXPath("//img[@src='/dist/images/logo-alter.png']").click();
		
		//Regular expression : //*[@attribute='value']
		driver.findElementByXPath("//*[@class='clnumber']").click();
		
	}

}

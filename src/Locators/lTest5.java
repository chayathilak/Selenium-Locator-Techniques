package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class lTest5 {

	public static void main(String[] args) {
	
		//invoke .exe file
		System.setProperty("webdriverchrome.driver", "driver\\Chromedriver.exe");
				
		//Create driver object for chrome browser
		//Class name = ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Go to url : Findmyfare
		driver.get("https://login.salesforce.com/?locale=eu");
		
		//Regular expression : //tagName[@attribute='value']
		//<label for="rememberUn" class="fl pr db tn3">Remember me</label>
		System.out.println(driver.findElementByXPath("//label[@for='rememberUn']").getText());

		//<a class="button secondary" id="signup_link"</a>
		driver.findElementByXPath("//*[@class='button secondary']").click();
		
		//navigate back
		driver.navigate().back();
		

	}

}

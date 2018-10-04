package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class lTest1 {

	public static void main(String[] args) {
		
		//invoke .exe file
		System.setProperty("webdriverchrome.driver", "driver\\Chromedriver.exe");
				
		//Create driver object for chrome browser
		//Class name = ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Go to url : Findmyfare
		driver.get("https://www.findmyfare.com/account/register");
		
		//Identify email edit box by id
		driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
		
		//Identify password field by name
		driver.findElement(By.name("password")).sendKeys("Test123");
		
		//Identify locator with linkedText
		driver.findElementByLinkText("New ? Sign up here").click();
		
			
		
	}

}

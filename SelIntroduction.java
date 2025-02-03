package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) {

		//Invoking Browser
		//Chrome - Driver->Methods
		
	//	System.setProperty("webdriver.chrome.driver", "")
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	   
	    
	    driver1.get("https://rahulshettyacademy.com/");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	 	}

}

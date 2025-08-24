package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String args[]) {
       
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("username"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().contextClick().build().perform();



		
	
	}
}


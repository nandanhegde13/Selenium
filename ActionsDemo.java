package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//a[@title='Login']"))).build().perform();
        a.moveToElement(driver.findElement(By.className("Pke_EE"))).click().keyDown(Keys.SHIFT).sendKeys("HELLO").doubleClick().contextClick().build().perform();
        
	}

}

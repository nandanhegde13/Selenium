package Default;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> w = driver.getWindowHandles();
		Iterator<String> it = w.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		String email  = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].split(" ")[1];
		driver.switchTo().window(parentId);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("username"))).click().sendKeys(email).doubleClick().contextClick().build().perform();

		System.out.println(email);
		
		
	}
}

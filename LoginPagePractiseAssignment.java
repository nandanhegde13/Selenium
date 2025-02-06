package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePractiseAssignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select drop = new Select(dropdown);
		drop.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("signin")).click();
		
		WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List<WebElement> products =driver.findElements(By.xpath("//div[contains(@class,'card-footer')]/button"));
		
		for(int i=0;i<products.size();i++)
		{
			products.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
		driver.findElement(By.cssSelector("input[class*='validate']")).sendKeys("Test");
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		
	}

}

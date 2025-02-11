package Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreenKart1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		addItems(driver);
		
		
	}
	
	@SuppressWarnings("deprecation")
	public static void addItems(WebDriver driver) throws InterruptedException
	{   		
		driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']/following-sibling::div[2]/button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//h4[text()='Beetroot - 1 Kg']/following-sibling::div[2]/button[text()='ADD TO CART']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.cssSelector("[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(8));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		WebElement select = driver.findElement(By.xpath("//label[text()='Choose Country']/following-sibling::div/select"));
		Select dropdown = new Select(select);
		dropdown.selectByVisibleText("India");
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
	}

}

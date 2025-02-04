package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.id("inputUsername")).sendKeys("hegdenandan013@gmail.com");
         driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacadem");
         driver.findElement(By.className("submit")).click();
         driver.findElement(By.linkText("Forgot your password?")).click();
         driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Nandan");
         driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hegdenandan013@gmail.com");
      //   driver.findElement(By.xpath("//input[@placeholder='Phone Number']['1']")).sendKeys("9980865436");
         driver.findElement(By.xpath("//form/input[3]")).sendKeys("9980865436");
         driver.findElement(By.className("reset-pwd-btn")).click();
         System.out.println(driver.findElement(By.cssSelector("form p")).getText());
         driver.findElement(By.className("go-to-login-btn")).click();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
         driver.findElement(By.id("inputUsername")).sendKeys("hegdenandan013@gmail.com");
         driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
         driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
         
         
         
         
         
	}

}

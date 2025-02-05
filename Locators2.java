package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {


	public static void main(String args[]) throws InterruptedException
	{
		String Name="hegdenandan013@gmail.com";
		 WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         String pass = getPassword(driver);
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.id("inputUsername")).sendKeys(Name);
         driver.findElement(By.name("inputPassword")).sendKeys(pass);
         driver.findElement(By.className("submit")).click();
         Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'login-container')]/p")).getText(),"You are successfully logged in.");         
         Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'login-container')]/h2")).getText(),"Hello "+Name+",");
         driver.findElement(By.tagName("button")).click();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        String[] passwordArray = passwordText.split("'");
        String password = passwordArray[1].split("'")[0];      
        return password;
        
        


	}
}

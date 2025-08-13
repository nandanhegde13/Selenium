
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class Assignment1 {

	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://amazon.in");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys("Phone_No");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Your_Password");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//div[@data-cy='title-recipe'])[1]")).click();
		driver.findElement(By.id("buy-now-button")).click();
		

		
	}
}

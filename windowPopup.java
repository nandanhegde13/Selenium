package Default;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class windowPopup {

	public static void main(String args[]) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://admin:admin@the-internet.herokuapp.com/");
	//	driver.findElement(By.linkText("Basic Auth")).click();
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(3000);

		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\NandanSH\\Desktop\\FileUpload.exe");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTaskTextBtn")));
		
		driver.findElement(By.id("processTaskTextBtn")).click();
		
		

		
	}
}

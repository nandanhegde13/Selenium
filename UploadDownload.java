package Default;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
	
		//Download
		driver.findElement(By.id("downloadButton")).click();
		
		
		
		
		
		//edit excel
		
		
		
		
		//upload
		
		WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));
		upload.sendKeys("C:\\Users\\NandanSH\\Downloads\\download.xlsx");
		
		
		
		
		//Wait for success and disappear
		
		
		
		
		//Verify
	}

}

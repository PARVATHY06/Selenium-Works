package testng_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUpload_Sendkeys {
	ChromeDriver driver;
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void file_upload()
	{
		WebElement file_btn=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		file_btn.sendKeys("C:\\Users\\PARVATHY KRISHNAN\\OneDrive\\Pictures\\Screenshots\\macy homepage.png");
	}

}

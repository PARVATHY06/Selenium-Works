package testng_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Copy_Paste {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void rediff()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void register() throws Exception
	{
		WebElement fullname=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
		fullname.sendKeys("aparna r");
		
		//to select the value from fullname field(ctrl+a)
		
		Actions act = new Actions(driver);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("a");
		act.keyUp(Keys.CONTROL);
		
		act.keyDown(fullname,Keys.CONTROL).sendKeys("c");
		act.keyUp(Keys.CONTROL);
		
		WebElement rediffid =driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		act.keyDown(rediffid,Keys.CONTROL).sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void close_method()
	{
		driver.quit();
	}

}

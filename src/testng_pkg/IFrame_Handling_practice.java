package testng_pkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrame_Handling_practice {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://vinothqaacademy.com/iframe/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void project_details() throws Exception
	{
		Thread.sleep(4000);

		WebElement frame_tag=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/iframe[1]"));
		driver.switchTo().frame(frame_tag);
	
        WebElement name=driver.findElement(By.xpath("//*[@id=\"nameInput\"]"));
		name.click();
		name.sendKeys("reshma");
		
	}
	
	@AfterTest
	public void end()
	{
		driver.quit();
	}
	
}
	
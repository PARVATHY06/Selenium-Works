package testng_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Right_and_Double {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Exception
	{
		Thread.sleep(2000);
		WebElement Double_click=driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		Actions act = new  Actions(driver);
		act.doubleClick(Double_click);
		
		Thread.sleep(2000);

		WebElement Right_click=driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		act.contextClick(Right_click);
		act.perform();
		

	}
	@AfterClass
	public void close_method()
	{
		driver.quit();
	}

}

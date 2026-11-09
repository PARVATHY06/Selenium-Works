package testng_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{
	ChromeDriver driver;
	@BeforeClass
	public void browser_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Parameters({"UN","PW"})
	
	@Test
	public void Login(String UN,String PW)
	{
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		Username.sendKeys(UN);
		
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		Password.sendKeys(PW);
	}

}

package testng_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeTest
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("chrome browser");		
		}
		
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
			System.out.println("chrome browser");	
		}
	
		else
		{
			driver=new FirefoxDriver();
			System.out.println("Firefox runs successfully");	
		}
	}
	
	@Test
	public void method1() throws Exception
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

}

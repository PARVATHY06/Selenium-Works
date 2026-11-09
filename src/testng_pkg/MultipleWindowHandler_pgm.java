package testng_pkg;


import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindowHandler_pgm {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception
	{
		String parentwindow = driver.getWindowHandle(); //details of parent window(single window)
		System.out.println("Title of google " + driver.getTitle());
		
		//driver.switchTo().newWindow (WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		driver.close(); //to close the current tab
		
		ArrayList<String> windowdetails = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowdetails.get(1)); //redirect back to 1st tab(index position)
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(parentwindow);

	}
	
	@AfterTest
	public void ends() {
		//driver.close();
        driver.quit();
	}
	
	

}

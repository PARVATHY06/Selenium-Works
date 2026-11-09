package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_pgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup()
	{
	    System.out.println("before each method");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void title_verification()
	{
	    System.out.println("Test method 1");
		String actual_title = driver.getTitle();
		String expected_title = "Google";
		if(actual_title.equals(expected_title))
		{
			System.out.println("Titles matched");
		}
		else
		{
			System.out.println("Titles are not matched");

		}
     }
	
	@Test
	public void method2()
	{
		System.out.println("Test method2");
	}
	
	@AfterEach
	public void close_method()   //does not give method name as 'close'
	{
	    System.out.println("after each method");

		//driver.close();  //to close the current  browser tab
	    driver.quit();
	}

}

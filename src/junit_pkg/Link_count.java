package junit_pkg;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_count {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void link_count_method()
	{
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Number of links : " +link.size());
		
		
		for(WebElement li :link)
		{
			System.out.println("Link --- " +li.getAttribute("href"));
			System.out.println(li.getText() +"----" + li.getAttribute("href")); //to retrieve text

		}
		
	}
	@AfterEach
	public void close_method()
	{
	 driver.quit();
	}

}

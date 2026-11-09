package testng_pkg;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandler_pgm {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		String parent_window = driver.getWindowHandle();  // details of parent window
		
		WebElement search_bar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search_bar.sendKeys("Mobiles");
		
		WebElement icon = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		icon.click();
		
		WebElement phone_link = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a[1] "));
		phone_link.click();
		
		Set<String> tabdetails = driver.getWindowHandles();  //-->Set is unordered,comes under ArrayList
		
	    //we can use ArrayList to switch
//		ArrayList<String> windowdetails = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(windowdetails.get(1)); //redirect back to 1st tab(index position)
		
		
		for(String handle : tabdetails)
		{
			if(!handle.equalsIgnoreCase(parent_window))  
			{
				driver.switchTo().window(handle);
				File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(s, new File("./screenshot/image.png"));
				System.out.println("Screenshot Saved Successfully!!");
			}
		}
		
	}
	
	@AfterMethod
	public void closing_method()
	{
		driver.quit();;
	}
	

}

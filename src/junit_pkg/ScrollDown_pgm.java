package junit_pkg;

import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollDown_pgm {
	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void scrolldown_mthd() throws Exception 
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,2000)");
		Thread.sleep(2000);
		// Screenshots
		
       File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   FileHandler.copy(s,new File("./Screenshots/Amazon.png")); //  './'  represents the current repository
	   
	  
		js.executeScript("scrollBy(0,500)");
		Thread.sleep(2000);
		// Screenshots
		
      File scrn = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   FileHandler.copy(scrn,new File("./Screenshots/Footer.png"));
	}

}



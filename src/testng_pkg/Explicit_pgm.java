package testng_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Explicit_pgm {
	ChromeDriver driver;
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void ebay()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a/span"))).click();

		driver.navigate().refresh(); // for refreshing the page
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a/span"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
		Actions act = new Actions(driver);
		act.moveToElement(electronics).perform();
		
//		WebElement options=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
//		options.click();
		

	}

}

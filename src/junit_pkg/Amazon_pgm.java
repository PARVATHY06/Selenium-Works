package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_pgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void search() throws Exception
	{
		Thread.sleep(2000); //java weight to hold for a second
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		// search.sendKeys("Mobile");
		search.sendKeys("Mobiles",Keys.ENTER); //to press the enter key through code
		
		Thread.sleep(1000);
		WebElement electronics = driver.findElement(By.xpath("//a[@href=\"/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics\"]"));
		electronics.click();
		
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//a[@href=\"/gp/cart/view.html?ref_=nav_cart\"]"));
		cart.click();

	}
	@AfterEach
	public void close_method()
	{
		driver.quit();
	}
	

}

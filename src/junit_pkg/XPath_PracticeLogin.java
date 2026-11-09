package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_PracticeLogin {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() {
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Password123");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id='submit']"));
		submit.click();

	}
	@AfterEach
	public void close_method()
	{
		driver.quit();
	}

}

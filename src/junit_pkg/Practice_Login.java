package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Login {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	
   @Test
   public void Login()
   {
	   WebElement username = driver.findElement(By.id("username"));
	   username.sendKeys("student");
	   WebElement password = driver.findElement(By.id("password"));
	   password.sendKeys("Password123");
	   WebElement submit = driver.findElement(By.id("submit"));
	   submit.click();
	   System.out.println("Login successfull");
   } 
	   @AfterEach
	   public void closing_method()
	   {
		   driver.quit();
	   }
	   
   }


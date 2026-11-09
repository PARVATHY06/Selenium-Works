package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeralaProperty_Login {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(" https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();  //to maximize the window/screen
	}
	
	@Test
	public void Title_verification()
	{
		String actual_title = driver.getTitle();
		System.out.println("The title of the page : " +actual_title);
	}
	
	
	@Test
	public void Text_verification()
	{
		String source_code = driver.getPageSource();  // to retrieve the source code information
		if(source_code.contains("User Login"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");

		}
	}
	
	
	@Test
	public void Login()
	{
		WebElement username = driver.findElement(By.id("ulogin")); //Locating user name with the help of locator id
		username.sendKeys("Abcd"); // Only string values is accepted in sendKeys("")
		WebElement password = driver.findElement(By.name("upass")); //Locating password field with locator'name'
		password.sendKeys("1234");
		WebElement  login_name = driver.findElement(By.id("sub_logbtn"));
		login_name.click();
	   System.out.println("Login successfull");
	}
	
	
	
	@AfterEach
	public void closing_method()
	{
		driver.quit();
	}

}

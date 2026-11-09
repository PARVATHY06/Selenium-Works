package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo_Verification {
	
	ChromeDriver driver;
	@BeforeEach
	public void rediff()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void register() throws Exception
	{
		WebElement logo = driver.findElement(By.xpath("//img[@title=\"Rediffmail\"]"));
		boolean result =logo.isDisplayed();
		
		if(result==true)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
        }
		
		
		WebElement female_radiobutton=driver.findElement(By.xpath("//input[@value=\"f\"]"));
		boolean button_enabled = female_radiobutton.isEnabled(); //to verify whether the button is enabled or not ---> isEnabled()
		System.out.println("Female radiobutton is Enabled : " +button_enabled); 

		WebElement checkbox = driver.findElement(By.xpath("//input[@class=\"nomargin\"]"));
		checkbox.click();
		Thread.sleep(2000);
		boolean checkbox_button =checkbox.isSelected();//to verify the button is selected or not ---> isSelected()
		
		
		if(checkbox_button==true)
		{
			System.out.println("Checkbox is selected"); 

		}
		else
		{
			System.out.println("Checkbox is not selected"); 
			

		}
		
	    }
	@AfterEach
	public void close_method()
	{
		driver.quit();
	}

 
}












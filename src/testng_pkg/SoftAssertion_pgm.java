package testng_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion_pgm {
	ChromeDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void logo_verification()
	{
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		boolean result = logo.isDisplayed();
		System.out.println(result);
		
		SoftAssert obj=new SoftAssert();
		obj.assertTrue(result);//verifying whether the value of the result is true 
		obj.assertAll();
		System.out.println("logo is displayed");
	}
	
	@Test
	public void title_verification()
	{
		String actualtitle=driver.getTitle();
//		System.out.println(actualtitle);
		
		String expectedtitle="Rediffmail Free Unlimited Storage";
		SoftAssert obj=new SoftAssert();
		obj.assertEquals(expectedtitle, actualtitle);
		obj.assertAll();//to retrieve the reason behind failure of the execution
		System.out.println("success");
	}

}

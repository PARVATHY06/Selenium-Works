package testng_pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAssertion_pgm {
	ChromeDriver driver;
	
	@BeforeClass
	public void browser_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();;
	}
	
	@Test(priority=1)
	public void title_verification()
	{
		String actualtitle=driver.getTitle();
//		System.out.println(actualtitle);
		
		String expectedtitle="Rediffmail Free Unlimited Storage";
		Assert.assertEquals(expectedtitle,actualtitle);
		System.out.println("title verification success"); //This line will be executed only after the assertion is passed
	}
	@Test(priority=2)
	public void url_verification()
	{
		String actualurl=driver.getCurrentUrl();//to get the current url of the web application
//		System.out.println(actualurl);
		
		String expectedurl="https://register.rediff.com/register/register.php?FormName=user_details";
		Assert.assertEquals(expectedurl,actualurl);
		System.out.println("url verification completed");
	}
	
	

}

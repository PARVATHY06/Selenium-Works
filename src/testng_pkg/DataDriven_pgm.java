package testng_pkg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.Excelutils;

public class DataDriven_pgm {
	ChromeDriver driver;
	@BeforeMethod
	public void url_method()
	{
		driver=new ChromeDriver();
	   driver.get("https://keralaproperty.in/member/login/");
	   driver.manage().window().maximize();
	}
	
	//DataProvider is used to supply multiple sets of test data to a TestNG test method.
	
	@DataProvider(name = "loginData")
	public Object[][] getData() throws Exception
	{
		String path="C:\\Users\\PARVATHY KRISHNAN\\OneDrive\\Desktop\\datadriven.xlsx";
		String sheet="login";
		return Excelutils.getTestData(path, sheet);// calling getTestData of Excelutils class
	}
	
	@Test(dataProvider="loginData")
	public void loginTest(String uname,String pass) //parameter name and object name given in webElement should be different
	{
//	   driver.navigate().refresh();
		
		WebElement username=driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		username.sendKeys(uname);
		WebElement password=driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		password.sendKeys(pass);
		WebElement login=driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
		login.click();
		
		System.out.println("Executed for --"+uname);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
	}
	
	@AfterMethod
	public void browser_mthd()
	{
		driver.quit();
	}

}

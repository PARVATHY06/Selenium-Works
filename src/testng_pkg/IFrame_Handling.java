package testng_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrame_Handling {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void login_mthd()
	{
		WebElement username=driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		username.sendKeys("parvathykrishnan862@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		password.sendKeys("parvathy@62");
		
		WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
		loginbtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
		
	}
	
	@Test(priority=2)
	public void addproperty_mthd()
	{
		WebElement addproperty=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
		addproperty.click();
		
		//summary box is inside iframe so we need to switch to that iframe 1st and then pass values to the summarybox
		
		WebElement frame_tag=driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
		driver.switchTo().frame(frame_tag);
		
		WebElement summary_box=driver.findElement(By.xpath("/html/body"));
		summary_box.click();
		summary_box.sendKeys("Text description");
		
		driver.switchTo().defaultContent();
		
	}

}

package testng_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RightDouble_2 {
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dragdrop_methd() throws Exception
	{
		WebElement rightclickme=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(rightclickme);
		act.perform();
		Thread.sleep(2000);

		
		WebElement edit_option=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		edit_option.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		
		WebElement doubleclickme=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	    act.doubleClick(doubleclickme);
	    act.perform();
		Thread.sleep(2000);
        driver.switchTo().alert().accept();
		Thread.sleep(2000);

	}
	@AfterClass
	public void close_mthd()
	{
		driver.quit();
	}

}

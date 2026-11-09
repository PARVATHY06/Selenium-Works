package testng_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Drag_and_Drop {
	
	ChromeDriver driver;
	@BeforeClass
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void draganddrop_methd() throws Exception
	{
		WebElement src=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p/b"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p/b"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
		
		Thread.sleep(2000);
		WebElement hover_btn=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		
		act.moveToElement(hover_btn).perform();
		
		WebElement link_1=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div"));
		link_1.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement clickbtn=driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		clickbtn.click();
		act.clickAndHold(clickbtn).perform();
		Thread.sleep(2000);
		
		WebElement double_click=driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
		act.doubleClick(double_click).perform();
		Thread.sleep(2000);


	}
}

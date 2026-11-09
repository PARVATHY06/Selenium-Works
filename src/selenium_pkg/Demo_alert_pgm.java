package selenium_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_alert_pgm {
	ChromeDriver driver;
	@BeforeEach
	public void demo()
	{
      driver = new ChromeDriver();
      driver.get("https://demo.automationtesting.in/Alerts.html");
      driver.manage().window().maximize();
	}
	@Test
	public void demo_site() throws Exception
	{
		WebElement alert_with_ok=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		alert_with_ok.click();
		
		WebElement alert_box=driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		alert_box.click();
		
		Alert alrt =driver.switchTo().alert();
		String alert_txt = alrt.getText();
		System.out.println("Alert is ");
		Thread.sleep(2000);
		alrt.accept();
		
		WebElement OK_Cancel=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		OK_Cancel.click();
		
		WebElement Confirm_box=driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		Confirm_box.click();
		
		Alert alrt_confirm =driver.switchTo().alert();
		String alrt_text =alrt_confirm.getText();
		System.out.println("Alert is ");
		Thread.sleep(2000);
		alrt_confirm.accept();
		
		WebElement Text_box=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		Text_box.click();
		
		WebElement prompt_box=driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		prompt_box.click();
		
		Alert alrt_prompt =driver.switchTo().alert();
		String alert_prom =alrt_prompt.getText();
		System.out.println("Alert is ");

		Thread.sleep(2000);
		alrt_prompt.sendKeys(alert_prom);
		
		Thread.sleep(2000);
		alrt_prompt.dismiss();
		

	}

}

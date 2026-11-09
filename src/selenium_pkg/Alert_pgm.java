package selenium_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pgm {
	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/PARVATHY%20KRISHNAN/OneDrive/Desktop/Alert.html");
		driver.manage().window().maximize();
	}
	@Test
	public void Display_alert() throws Exception
	{
		WebElement Display_box = driver.findElement(By.xpath("/html/body/input[1]"));
		Display_box.click();
		
		//handle Alert box
		Alert alrt=driver.switchTo().alert(); //to switch the control to the alert box
		String alert_text =alrt.getText();//to retrieve the text from the alert box 
		System.out.println("Alert text : " +alert_text);
		
		Thread.sleep(2000);
		alrt.accept(); //to click the OK button of the alert box 
		
		
		WebElement First_name = driver.findElement(By.xpath("/html/body/input[2]"));
		First_name.sendKeys("Parvathy");
		
		WebElement Last_name = driver.findElement(By.xpath("/html/body/input[3]"));
		Last_name.sendKeys("Krishnan");
		
		WebElement Submit_button = driver.findElement(By.xpath("/html/body/input[4]"));
		Submit_button.click();
		
	}

}

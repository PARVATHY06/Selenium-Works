package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_contains {
	ChromeDriver driver;
	
    @BeforeEach
    public void setup()
    {
    	driver= new ChromeDriver();
    	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    	driver.manage().window().maximize();
    }
    
    @Test
     public void register() throws Exception
     {
       WebElement rediffmail = driver.findElement(By.xpath("//input[contains(@id,\"login\")]"));
       rediffmail.sendKeys("acc@12");
       
       Thread.sleep(2000);
       
       WebElement fullname = driver.findElement(By.xpath("//input[contains(@name,\"name\") and @placeholder=\"Enter your full name\"]")); //name field is repeated in many place so contains should used to locate the co rrect name field
       fullname.sendKeys("Maya");
       
       Thread.sleep(2000);

       }

}

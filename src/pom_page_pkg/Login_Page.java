package pom_page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	WebDriver driver;
	
	//Locating webelements using page factory
	
	@FindBy(xpath="//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(xpath="//*[@id=\"upass\"]")WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]")WebElement loginbtn;
	
	//Constructor
	public Login_Page(WebDriver driver) //Parameterized constructor
	{
		this.driver=driver; 
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	public void setvalues()
	{
		username.sendKeys("abc@gmail.com");
		password.sendKeys("1234");
	}
	
	public void loginmthd()
	{
		loginbtn.click();
	}
	
	public String titlemthd()
	{
		String title=driver.getTitle();
		return title;
	}
	
}

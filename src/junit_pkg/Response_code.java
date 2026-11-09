package junit_pkg;

import java.net.HttpURLConnection;
import java.net.URI;
  import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Response_code {
	ChromeDriver driver;
	@BeforeEach
	public void property()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void Login() throws Exception
	{
		String url = driver.getCurrentUrl();
		URI obj = new URI(url); //Verifying the text is in link format
		URL link =obj.toURL();
		HttpURLConnection con =(HttpURLConnection) link.openConnection();
		int Responsecode = con.getResponseCode();
		System.out.println("Responsecode is : " +Responsecode);
		
		if(Responsecode==200)
		{
			System.out.println("Valid link");
		}
		else if(Responsecode==404)
		{
			System.out.println("Broken link");
		}
		else
		{
			System.out.println("Other Responscode");

		}
	}
	@AfterEach
	public void close_method()
	{
		driver.quit();
	}
}



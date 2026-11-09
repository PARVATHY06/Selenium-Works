package junit_pkg;

import java.net.HttpURLConnection;
import java.net.URI;
//import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Responsecode {
	ChromeDriver driver;
	@BeforeEach
	public void Google()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}
	@Test
	public void link_count() throws Exception
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links : " +links.size());
		
		for(WebElement li: links)
		{
			String url =li.getAttribute("href");
			verify(url);
		}
	}
	private void verify(String url) throws Exception {
		URI obj = new URI(url);
		URL value = obj.toURL(); // to change into URL for perform get,put,patch actions.
		HttpURLConnection con = (HttpURLConnection) value.openConnection();
		int responsecode = con.getResponseCode();
		System.out.println("Responsecode --> "+responsecode);
		
		if(responsecode==200)
		{
			System.out.println("Valid link : " +url);
		}
		else if(responsecode==404)
		{
			System.out.println("Broken link : " +url);
        }
		else
		{
			System.out.println("Other responsecode : " +url);

		}
	}
}

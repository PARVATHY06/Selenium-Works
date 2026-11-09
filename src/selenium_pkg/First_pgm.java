package selenium_pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class First_pgm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();  //for opening edge browser
		//FireFoxDriver driver = new FireFoxDriver(); // for opening FireFox browser
        driver.get("https://www.google.com/");
        String actual_title =driver.getTitle();   //to retrieve the title of the web application
        System.out.println("The title of the web application is : " +actual_title);
        
        String expected_title = "Google";
        
        if(actual_title.equals(expected_title))
        {
        	System.out.println("The titles matched");
        }
        else
        {
        	System.out.println("The title is not  matched");

        }
		}
}

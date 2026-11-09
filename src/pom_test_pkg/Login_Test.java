package pom_test_pkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_base_pkg.Base_Class;
import pom_page_pkg.Login_Page;

public class Login_Test extends Base_Class  //Here we extends Base_Class for retrieving the driver information from the Base class
{
	Login_Page obj;
	
	@BeforeMethod
	public void object_mthd()
	{
		 obj=new Login_Page(driver);

	}
	
	@Test
	public void logintest_mthd()
	{
		obj.setvalues();
		obj.loginmthd();
	}
	
	@Test
	public void titleverification()
	{
		System.out.println(obj.titlemthd());

	}
	

}

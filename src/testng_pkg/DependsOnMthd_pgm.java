package testng_pkg;

import org.testng.annotations.Test;

public class DependsOnMthd_pgm {
	@Test
	public void reg()
	{
		System.out.println("Registration method");
	}
	
	@Test(dependsOnMethods = "reg") //Login method depends on the reg() method.so Login method runs only after successful execution of contents in the reg() method
	public void login()
	{
		System.out.println("Login method");

	}
	
	@Test(dependsOnMethods = {"reg","login"})
	public void home()
	{
		System.out.println("Home method");

	}

}

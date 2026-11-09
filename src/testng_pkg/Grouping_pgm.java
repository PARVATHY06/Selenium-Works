package testng_pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grouping_pgm {
	
	@BeforeClass(alwaysRun=true)
	public void BfClass_mthd()
	{
		System.out.println("beforeclass_method");
	}
	
	@Test(priority=1,groups="smoke")
	public void testmthd()
	{
		System.out.println("Test1_method");
	}
	
	@Test(priority=2,groups="sanity")
	public void testmthd_2()
	{
		System.out.println("Test2_method");
	}
	
	@Test(priority=3,groups= {"regression","smoke"})
	public void testmthd_3()
	{
		System.out.println("Test3_method");
	}
	
	@AfterClass(alwaysRun=true) 
	public void AfClass_mthd()
	{
		System.out.println("Afterclass_mthd");

	}

}

package testng_pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority_pgm {
	
	@BeforeClass
	public void BfClassmthd()
	{
		System.out.println("BeforeClassmethod");
	}
	
	
	@Test(priority = 1,invocationCount = 3) //for execute 3 times
	public void Mthd_X()
	{
		System.out.println("method_X");

	}
	
	
	@Test(priority = 2,enabled = false)
	public void Mthd_A()
	{
		System.out.println("method_A");

	}
	
	@Test(priority = 3)
	public void Mthd_F()
	{
		System.out.println("method_F");

	}
	
	@AfterClass
	public void AfClass_mthd()
	{
		System.out.println("AfterClassMethod");
	}

}

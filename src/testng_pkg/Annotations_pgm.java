package testng_pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_pgm {
	@BeforeTest
	public void beforetestmethod()
	{
		System.out.println("BeforeTest method");
	}
	
	@BeforeClass
	public void beforeclass_mthd()
	{
		System.out.println("BeforeClass method");

	}
	
	@BeforeMethod
	public void methd()
	{
		System.out.println("BeforeMethod");

	}
	
	@Test
	public void testmethod_A()
	{
		System.out.println(" Testmethod_A");

	}
	@Test
	public void testmethod_X()
	{
		System.out.println(" Testmethod_X");

	}
	@Test
	public void testmethod_C()
	{
		System.out.println(" Testmethod_C");

	}
	
	@AfterMethod
	public void af_mthd()
	{
		System.out.println(" Aftermethod");

	}
	
	@AfterClass
	public void Ac_mthd()
	{
		System.out.println(" AfterClassMethod");

	}
	
	@AfterTest
	public void At_mthd()
	{
		System.out.println(" AfterTestMethod");

	}



}
 
package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import appcode.SomeClassToTest;

public class TestNG_DependentTests {
	
	SomeClassToTest obj;
	
	@BeforeMethod
	public void test(){
		System.out.println("-+-+This runs BEFORE method");
	}
	@BeforeClass
	public void setUp(){
		obj = new SomeClassToTest();
		System.out.println("*********This runs BEFORE class");
	}

	@AfterClass
	public void cleanUp(){
		System.out.println("**********This runs AFTER class");
	}
	
	@Test(dependsOnMethods = {"testMethod2"})
	public void testMethod1() {
		System.out.println("testMethod1");
	
	}
	
	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
		int result = obj.sumNumber(1, 2);
		AssertJUnit.assertEquals(result, 3); 
	}
	
	
	@Test(dependsOnMethods = {"testMethod1"})
	public void testMethod3() {
		System.out.println("testMethod3");
	}
	
	@Test
	public void testMethod4() {
		System.out.println("testMethod4");
	}

}

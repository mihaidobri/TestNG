package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_BeforeClassAnnotations {
	
	@BeforeClass
	public void setUp(){
		System.out.println("*********This runs BEFORE class");
	}

	@AfterClass
	public void cleanUp(){
		System.out.println("**********This runs AFTER class");
	}
	

	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -> testMethod1");
		Assert.assertTrue(true);
	}
	
	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -> testMethod2");
		Assert.assertTrue(false);
	}

}

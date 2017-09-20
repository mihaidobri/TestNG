package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_TestClass1 {
	
	@BeforeClass
	public void setUp(){
		System.out.println("TestNG_TestClass1 *********This runs BEFORE class");
	}

	@AfterClass
	public void cleanUp(){
		System.out.println("TestNG_TestClass1 **********This runs AFTER class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestNG_TestClass1 This runs BEFORE every method");
	}

	@AfterMethod
	public void afterMethod(){ 
		System.out.println("TestNG_TestClass1 This runs AFTER every method");
	}

	@Test
	public void testMethod1() {
		System.out.println("TestNG_TestClass1 Running Test -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}

}

package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_Preserve2 {
	

	@Test
	public void testMethod1() {
		System.out.println("TestNG_Preserve2 -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("TestNG_Preserve2 -> testMethod2");
	}

}

package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Priority {
	
	public void setUp(){
		System.out.println("\n *********This runs BEFORE class");
	}

	@AfterClass
	public void cleanUp(){
		System.out.println(" **********This runs AFTER class");
	}
	
	@Test(priority=2)
	public void testMethod1() {
		System.out.println("TestNG_Priority -> testMethod1");
	}
	
	@Test(priority=1)
	public void testMethod2() {
		System.out.println("TestNG_Priority -> testMethod2");
	}
	
	@Test(priority=0)
	public void testMethod3() {
		System.out.println("TestNG_Priority -> testMethod3");
	}

}

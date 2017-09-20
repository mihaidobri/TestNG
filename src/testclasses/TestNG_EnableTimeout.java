package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_EnableTimeout {
	
	@BeforeClass
	public void setUp(){
		System.out.println("\n *********This runs BEFORE class");
	}

	@AfterClass
	public void cleanUp(){
		System.out.println("\n **********This runs AFTER class");
	}

	@Test(enabled=false)
	public void testMethod1() {
		System.out.println("\nRunning Test -> testMethod1");
	}
	
	@Test(timeOut=300)
	public void testMethod2() throws InterruptedException{
		System.out.println("\nRunning Test -> testMethod2");
		Thread.sleep(200);
	}

}

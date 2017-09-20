package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_TestParameters {
	
	@BeforeClass
	@Parameters({"browser","platform"})
	public void setUp(String browser,String platform){
		System.out.println("TestNG_TestParameters -> Setup");
		System.out.println("1. Parameter value from xml file: "+browser);
		System.out.println("2. Parameter value from xml file " +platform);
		
	}


	@Test
	@Parameters({"response"})
	public void testMethod1(String response ) throws InterruptedException {
		System.out.println("\nRunning Test -> testMethod1");
		System.out.println("Response from xml file "+response);
	}
	

}

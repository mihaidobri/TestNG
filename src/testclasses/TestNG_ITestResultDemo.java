package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_ITestResultDemo {
	

	@Test
	public void testMethod1() {
		System.out.println("Running Test ->  -> testMethod1");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test ->  -> testMethod2");
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void afterMethod (ITestResult testResult){
		if (testResult.getStatus() == ITestResult.FAILURE){
		System.out.println("\n#####WTF@@@@@@@    pica : " + testResult.getMethod().getMethodName());
}
	if (testResult.getStatus() == ITestResult.SUCCESS){
		System.out.println("\nCooooool   a trecut : " + testResult.getMethod().getMethodName());
}
}
}
package testclasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;

public class TestNG_SoftAsserts {
  @Test
  
	public void testSum() {
	  SoftAssert sa = new SoftAssert();
		System.out.println("\nRunning Test -> testSum");
		SomeClassToTest obj0 = new SomeClassToTest();
		
		int result = obj0.sumNumber(2, 1);
		System.out.println("\nLine after assert 1");
		
		sa.assertEquals(result, 2);
		System.out.println("\nLine after assert 2");
		sa.assertEquals(result, 3);
		
		sa.assertAll();
		
		
	}
}

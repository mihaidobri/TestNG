package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;
public class TestNG_Asserts {

	@Test
	public void testSum() {
		System.out.println("\nRunning Test -> testSum");
		SomeClassToTest obj0 = new SomeClassToTest();
		int result = obj0.sumNumber(2, 1);
		Assert.assertEquals(result, 3);
		
		
	}
	
	@Test
	public void testString() {
		System.out.println("\nRunning Test -> testString");
		String expectedString = "Hello World";
		SomeClassToTest obj1 = new SomeClassToTest();
		String result = obj1.addStrings("Hello","World");
		Assert.assertEquals(result, expectedString);
	}
	
	@Test
	public void testArray() {
		System.out.println("\nRunning Test -> testArray");
		int[] expectedArray = {1, 2, 3,4};
		SomeClassToTest obj2 = new SomeClassToTest();
		int [] result = obj2.getArray();
		Assert.assertEquals(result, expectedArray);
		System.out.println("\nEnd Test -> testArray");
		
	}
}
	



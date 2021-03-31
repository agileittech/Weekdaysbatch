package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionsclass {
	@Test(priority = 0,dependsOnMethods = "testcase1")
	public void testcase2() {
		System.out.println("This is from 1st testcase");
		//Assert.fail("Failed during ....");
		Assert.assertEquals("HELL", "HELLO");
		
		System.out.println("This is from 2nd line");
	}
	@Test(priority = 1)
	public void testcase1() {
			System.out.println("This is from 2nd test case");
			SoftAssert s = new SoftAssert();
			s.assertEquals("hi", "hi");
			System.out.println("this is from 2nd tc 2nd line");
			
			//s.fail("Failed due to ....");
		s.assertAll();
	}
}

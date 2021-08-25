package com.dhruv.test.testFlakey.testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void test() {
		Assert.assertEquals("1", "1","Assertion Falied: Third test failed");
		System.out.println("Third Test Passed");
	}

}

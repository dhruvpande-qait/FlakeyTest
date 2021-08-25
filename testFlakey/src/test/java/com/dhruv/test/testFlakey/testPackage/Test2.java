package com.dhruv.test.testFlakey.testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void test() {
		Assert.assertEquals("1", "1", "Assertion Falied: Second test failed");
		System.out.println("Second Test Passed");
	}
}

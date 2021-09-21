package com.dhruv.test.testFlakey.testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void test() {
		Assert.assertEquals("1", "2","Assertion Falied: First test failed");
		System.out.println("First Test Passed");
	}
}

package com.Features;

import org.testng.annotations.Test;

public class Dependency {

	@Test(enabled = true)
	private void Secoundry() {
		System.out.println("6th To 10th ");
	}

	@Test(dependsOnMethods = "Secoundry",invocationCount = 3)
	private void HigherSecoundry() {
		System.out.println("11th To 12th ");
	}

	@Test(dependsOnMethods = "HigherSecoundry")
	private void College() {
		System.out.println("4 years ");
	}

}

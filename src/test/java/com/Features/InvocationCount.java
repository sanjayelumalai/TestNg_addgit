package com.Features;

import javax.security.auth.Refreshable;

import org.testng.annotations.Test;

public class InvocationCount {

	
	
	@Test(invocationCount = 5)
	private void Refresh() {
		System.out.println("Refresh The Page");
	}
}

package com.Features;

import org.testng.annotations.Test;

public class Priority {
	
	
	
	@Test(priority = -1)
	private void username() {
		System.out.println("Steve@123");

	}
	
	@Test(priority = 0)
	private void Data1() {
		System.out.println("Smith@123");
	}
	
	@Test(priority = 1)
	private void Password() {
		System.out.println("123445");
	}

}

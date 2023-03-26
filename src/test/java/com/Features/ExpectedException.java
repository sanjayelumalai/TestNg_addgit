package com.Features;

import org.testng.annotations.Test;

public class ExpectedException {
	
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void Calculation() {
		
		int a =10;
		int b=0;
		System.out.println(a/b);
		System.out.println("Done ");
		
	}

}

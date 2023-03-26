package com.Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {

	@Test(dataProvider = "provied")
	
	public static void Userdata1(@Optional("starc") String username, int password) {
		System.out.println("USERNAME :" + username);
		System.out.println("PASSWORD :" + password);

	}

	@DataProvider
	public Object[][] provied() {

		return new Object[][] {

				{ "Smith", 123 }, { "Steve", 12345 }, { "Starc", 1234567 } };
	}
}

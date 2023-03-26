package com.Features;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = "anima")
	private void Naruto() {
		System.out.println("Naruto");
	}

	@Test(groups = "dc")
	private void batman() {
		System.out.println("batman");
	}

	@Test(groups = "marval")
	private void BlackPather() {
		System.out.println("Black pather");
	}

	@Test(groups = "dc")
	private void harly() {
		System.out.println("harely");
	}

	@Test(groups = "marval")
	private void Ironman() {
		System.out.println("IRON man");
	}

	@Test(groups = "anima")
	private void Luffy() {
		System.out.println("Luffy");
	}

}

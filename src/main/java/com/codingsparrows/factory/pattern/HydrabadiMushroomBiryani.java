package com.codingsparrows.factory.pattern;

public class HydrabadiMushroomBiryani extends Biryani {

	public HydrabadiMushroomBiryani() {
		name = "Hydrabadi Mushroom  Biryani";
		rice = "Long Basmati Rice";
		for (String t : toppings) {
			System.out.println(" adding..." + t);
		}
	}
}

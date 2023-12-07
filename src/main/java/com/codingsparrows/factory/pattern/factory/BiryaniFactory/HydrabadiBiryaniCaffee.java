package com.codingsparrows.factory.pattern.factory.BiryaniFactory;

public class HydrabadiBiryaniCaffee extends BiryaniCaffee {

	@Override
	public Biryani prepareBiryani(String type) {
		System.out.println("Lets prepare  the Biryani you want ");
		if (type == null) {
			System.out.println("Please choose the biryano you like the most..!!");
			return null;
		} else if (type.equalsIgnoreCase("veg")) {
			return new HydrabadiVegBiryani();
		} else if (type.equalsIgnoreCase("mushroom")) {
			return new HydrabadiMushroomBiryani();
		}

		return null;

	}

}

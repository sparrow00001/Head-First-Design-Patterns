package com.codingsparrows.factory.pattern.factory.BiryaniFactory;

public class LucknowBiryaniCaffee extends BiryaniCaffee{

	@Override
	public Biryani prepareBiryani(String type) {
		
		if(type==null) {
			System.out.println("Please select a valid biryani type..!!");
			return null;
		}
		else if(type.equalsIgnoreCase("veg")) {
			return new LucknowVegBiryani();
		}
		
		return null;
	}
	
	
}

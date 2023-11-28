package com.codingsparrows.factory.pattern.BiryaniFactory;

public abstract class BiryaniCaffee {

	public Biryani orderBiryani(String type) {
		Biryani biryani;
		biryani = prepareBiryani(type);
		biryani.cookBiryani();
		biryani.addToppings();
		biryani.serveBiryani();
		return biryani;
	}

	public abstract Biryani prepareBiryani(String type);

}

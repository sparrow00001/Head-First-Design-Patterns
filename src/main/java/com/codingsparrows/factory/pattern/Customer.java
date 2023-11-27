package com.codingsparrows.factory.pattern;

public class Customer {

	public static void main(String... args) {

		HydrabadiBiryaniCaffee caffee = new HydrabadiBiryaniCaffee();

		caffee.orderBiryani("Veg");
		// System.out.println("Please enjoy your "+ caffee.getClass().getName());
	}

}

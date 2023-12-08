package com.codingsparrows.pattern.decorator.BeverageDecorator;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		description="HouseBlend";
	}
	
	@Override
	public double cost() {
		return 170;
	}
	
	
}

package com.codingsparrows.factory.pattern.decorator.BeverageDecorator;

public class Espresso extends Beverage{
	
	public Espresso() {
		description="Espresso";
	}
	
	@Override
	public double cost() {
		return 140;
	}
	
	
}

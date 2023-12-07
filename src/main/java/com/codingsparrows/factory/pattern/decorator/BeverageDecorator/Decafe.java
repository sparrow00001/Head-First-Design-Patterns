package com.codingsparrows.factory.pattern.decorator.BeverageDecorator;

public class Decafe extends Beverage{

	public Decafe() {
		description="DeCafe";
		
	}
	@Override
	public double cost() {
		
		return 120;
	}
	

	
}

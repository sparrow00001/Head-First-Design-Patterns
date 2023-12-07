package com.codingsparrows.factory.pattern.decorator.BeverageDecorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast";
	}

	@Override
	public double cost() {
		return 100;
	}

}
package com.codingsparrows.pattern.decorator.BeverageDecorator;

public class Mocha extends BeverageDecorator {


	public Mocha(Beverage drink) {
		beverage = drink;

	}

	@Override
	public double cost() {

		return 50 + beverage.cost();
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription()+" Mocha Added";
	}
}

package com.codingsparrows.pattern.decorator;

public class Whip extends BeverageDecorator{
	
	
	public Whip(Beverage base) {
		beverage=base;
	}
	
	@Override
	public double cost() {
		return 60+ beverage.cost();
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" Whip Added";
	}
}

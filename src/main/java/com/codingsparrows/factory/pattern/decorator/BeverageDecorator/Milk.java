package com.codingsparrows.factory.pattern.decorator.BeverageDecorator;

public class Milk extends BeverageDecorator{
	

	public Milk(Beverage base) {
		this.beverage=base;
	}
	@Override
	public double cost() {
		return 50+beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+" Milk added";
	}
	
	

}

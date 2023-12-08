package com.codingsparrows.pattern.decorator;

public class Soy extends BeverageDecorator {
	
	
	public Soy(Beverage drink) {
		this.beverage=drink;
	}
	
	@Override
	public double cost() {
		
		return 30+beverage.cost();
	}
	
	@Override
	public String getDescription() {

			return beverage.getDescription()+" Soy Added";
	}
}

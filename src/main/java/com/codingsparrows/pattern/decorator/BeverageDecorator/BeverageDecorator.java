package com.codingsparrows.pattern.decorator.BeverageDecorator;

public abstract class BeverageDecorator extends Beverage{
	
	Beverage beverage;
	
	@Override
	public abstract String getDescription() ;
	
}

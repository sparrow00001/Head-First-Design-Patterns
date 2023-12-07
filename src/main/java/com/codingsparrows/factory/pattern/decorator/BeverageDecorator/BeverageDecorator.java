package com.codingsparrows.factory.pattern.decorator.BeverageDecorator;

public abstract class BeverageDecorator extends Beverage{
	
	Beverage beverage;
	
	@Override
	public abstract String getDescription() ;
	
}

package com.codingsparrows.pattern.decorator;

public abstract class BeverageDecorator extends Beverage{
	
	Beverage beverage;
	
	@Override
	public abstract String getDescription() ;
	
}

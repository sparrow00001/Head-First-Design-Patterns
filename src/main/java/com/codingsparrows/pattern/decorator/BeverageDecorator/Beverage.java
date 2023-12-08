package com.codingsparrows.pattern.decorator.BeverageDecorator;

public abstract class Beverage {

	public String description = "Unknown Beverage";

	public abstract double cost();

	public String getDescription() {

		return description;
	}
}

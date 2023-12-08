package com.codingsparrows.pattern.decorator;

public abstract class Beverage {

	public String description = "Unknown Beverage";

	public abstract double cost();

	public String getDescription() {

		return description;
	}
}

package com.codingsparrows.pattern.template;

public abstract class CarManufacturingTemplate {

	final void manufactureCar() {
		System.out.println("Lets Start car Manufacturing...!!");

		designCar();
		assembleBody();
		installEngine();
		addInterior();
		paintCar();
		customizeCar();
		System.out.println("Your car is ready");

	}

	abstract void designCar();

	abstract void assembleBody();

	abstract void installEngine();

	abstract void addInterior();

	abstract void paintCar();

	public void customizeCar() {
		System.out.println("Added Seats and Foot Rests");
	}

}

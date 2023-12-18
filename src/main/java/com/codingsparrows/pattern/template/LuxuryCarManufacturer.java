package com.codingsparrows.pattern.template;

public class LuxuryCarManufacturer extends CarManufacturingTemplate{

	@Override
	void designCar() {
		 System.out.println("Luxury Car Manufacturer: Envisions an opulent and extravagant car design.");
		 
	}

	@Override
	void assembleBody() {
		  System.out.println("Luxury Car Manufacturer: Crafts the car body with precision and high-quality materials.");

	}

	@Override
	void installEngine() {
		System.out.println("Luxury Car Manufacturer: Installs a powerful and sophisticated engine.");
		
	}

	@Override
	void addInterior() {
		 System.out.println("Luxury Car Manufacturer: Creates a lavish and customizable interior experience.");
		 		
	}

	@Override
	void paintCar() {
		 System.out.println("Luxury Car Manufacturer: Offers a range of luxurious paint finishes, including custom options.");
		 		
	}
	
	public void customizeCar() {
        System.out.println("Luxury Car Manufacturer: Offers extensive customization options for the discerning customer.");
    }
	
	
}

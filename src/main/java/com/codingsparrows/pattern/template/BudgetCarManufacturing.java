package com.codingsparrows.pattern.template;

public class BudgetCarManufacturing extends CarManufacturingTemplate{

	@Override
	void designCar() {
		
		  System.out.println("Budget Car Manufacturer: Sketches a simple and affordable car design.");
	}

	@Override
	void assembleBody() {
		System.out.println("Budget Car Manufacturer: Assembles the car body with cost-effective materials.");
		
	}

	@Override
	void installEngine() {
		
		 System.out.println("Budget Car Manufacturer: Installs a reliable but basic engine.");
		  
	}

	@Override
	void addInterior() {
		System.out.println("Budget Car Manufacturer: Adds no-frills interior with essential features.");
		 		
	}

	@Override
	void paintCar() {
		
		 System.out.println("Budget Car Manufacturer: Applies a limited range of budget-friendly paint colors.");

	}
	public  void customizeCar() {
	        System.out.println("Budget Car Manufacturer: Adds basic optional features for customization.");
	    }
	
}

package com.codingsparrows.pattern.template;

public class CarManufacturingExample {
	
	public static void main(String[] args) {
		CarManufacturingTemplate car1= new BudgetCarManufacturing();
		CarManufacturingTemplate car2= new LuxuryCarManufacturer();
		
		car1.manufactureCar();
		car2.manufactureCar();
		
	}

}

package com.codingsparrows.pattern.decorator;

public class CoffeeOutlet {
	
	public static void main(String[] args) {
		Beverage beverage= new DarkRoast();
		
		beverage= new Soy(beverage);
		beverage= new Whip(beverage);
		
		System.out.println(beverage.cost());
		System.out.println(beverage.getDescription());;
	}

}

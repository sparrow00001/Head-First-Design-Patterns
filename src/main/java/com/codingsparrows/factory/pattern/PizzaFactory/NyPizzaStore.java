package com.codingsparrows.factory.pattern.PizzaFactory;

public class NyPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		if(type==null) {
			System.out.println("Please Choose a valid Pizza Style");
			return null;
		}
		else if(type.equalsIgnoreCase("veg")) {
			return new NyStyleCheesePizza();
		}
		else {
			
			return null;
		}
	}
}

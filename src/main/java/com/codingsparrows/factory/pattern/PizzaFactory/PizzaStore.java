package com.codingsparrows.factory.pattern.PizzaFactory;

public abstract  class PizzaStore {
		
	public Pizza orderPizza(String type) {
			Pizza pizza;
			 pizza= createPizza(type);
			 pizza.prepare();
			 pizza.bake();
			 pizza.box();
			 return pizza;
			 
	}
	
	public abstract Pizza createPizza(String type);
	
}

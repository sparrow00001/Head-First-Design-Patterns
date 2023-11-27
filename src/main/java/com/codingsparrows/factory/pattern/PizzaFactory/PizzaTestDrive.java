package com.codingsparrows.factory.pattern.PizzaFactory;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		PizzaStore pizzaStore= new NyPizzaStore();
		pizzaStore.orderPizza("veg");
	}
}

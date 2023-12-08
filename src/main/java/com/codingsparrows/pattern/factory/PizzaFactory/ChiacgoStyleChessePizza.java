package com.codingsparrows.pattern.factory.PizzaFactory;

public class ChiacgoStyleChessePizza extends Pizza{
		
	public ChiacgoStyleChessePizza() {
		name=" Chicago Style Deep Dish Cheese Pizza";
		dough="Extra Thick Crust Dough";
		sauce="Plum Tomato Sauce";
		toppings.add(" Shredded Mozzarella Cheese");
		
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into squares slices..!!");
	}

}

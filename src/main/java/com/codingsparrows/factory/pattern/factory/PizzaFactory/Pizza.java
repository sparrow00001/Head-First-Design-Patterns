package com.codingsparrows.factory.pattern.factory.PizzaFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	List<String> toppings= new ArrayList();

public void prepare() {
	System.out.println("Preparing "+ name);
	System.out.println("Tossing dough");
	System.out.println("Adding Sause");
	System.out.println("Adding toppings");
	
	for(String t : toppings) {
		System.out.println(" "+ t);
	}
}


public void bake() {
	System.out.println("Bake for 25 mins at 350 degree");
}
public void cut() {
	System.out.println("Cutting pizza into diagonal Slices");
}
public void box() {
	System.out.println("Packing the pizza into box");
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDough() {
	return dough;
}
public void setDough(String dough) {
	this.dough = dough;
}
public String getSauce() {
	return sauce;
}
public void setSauce(String sauce) {
	this.sauce = sauce;
}
public List<String> getToppings() {
	return toppings;
}
public void setToppings(List<String> toppings) {
	this.toppings = toppings;
}
@Override
public String toString() {
	return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", toppings=" + toppings + "]";
}
			


	
}

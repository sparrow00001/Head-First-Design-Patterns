package com.codingsparrows.factory.pattern.BiryaniFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Biryani {

	String name;
	String rice;
	List<String> toppings = new ArrayList();

	public void cookBiryani() {
		System.out.println("Lets strat cooking the biryani.." + this.name);
		System.out.println("Plesae wait for some time, Biryani tastes best when cook on low flame...");
		System.out.println("Your Biryani is about to cook ");

	}

	public void addToppings() {
		System.out.println("Adding your favorite toppings..!!");
		for (String x : toppings) {
			System.out.println("Adding " + x);
		}
	}

	public void serveBiryani() {
		System.out.println("Please Enjoy your biryani...!!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public List<String> getToppings() {
		return toppings;
	}

	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "Biryani [name=" + name + ", rice=" + rice + ", toppings=" + toppings + "]";
	}

}

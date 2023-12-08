package com.codingsparrows.pattern.command;

public class Heater implements Device	{
	
	@Override
	public void on() {
		
		System.out.println("Heater is on");
	}
	
	@Override
	public void off() {
		
		System.out.println("Heater is off");
	}
}

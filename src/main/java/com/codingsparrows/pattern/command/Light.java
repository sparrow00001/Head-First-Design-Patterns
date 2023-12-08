package com.codingsparrows.pattern.command;

public class Light implements Device {
	
	@Override
	public void on() {
		
		System.out.println("Light On");
	}
	
	@Override
	public void off() {
		System.out.println("Light Off");
	}

}

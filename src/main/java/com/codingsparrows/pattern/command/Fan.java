package com.codingsparrows.pattern.command;

public class Fan implements Device{
	
	@Override
	public void on() {
		
		System.out.println("Fan On");
	}
	
	@Override
	public void off() {
		
		System.out.println("Fan Off");
	}
}

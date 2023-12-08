package com.codingsparrows.pattern.command;

public class Door implements Device{

	public void on() {
		
		System.out.println("Door is Open");
	}
	
	public void off() {
		System.out.println("Door is Close");
	}
}

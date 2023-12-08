package com.codingsparrows.pattern.command;

public class TV implements Device {

	@Override
	public void on() {
		System.out.println("Tv is On");
	}

	@Override
	public void off() {

		System.out.println("TV is off");
	}
}

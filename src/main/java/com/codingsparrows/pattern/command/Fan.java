package com.codingsparrows.pattern.command;

public class Fan implements Device{
	public static final int HIGH=3;
	public static final int MEDIUM =2;
	public static final int LOW=1;
	public static final int OFF=0;
	public int speed;
	
	
	public void high() {
		this.speed=HIGH;
	}
	
	public void medium() {
		this.speed=MEDIUM;
	}
	
	public void low() {
		this.speed=LOW;
	}
	
	@Override
	public void on() {
		
		System.out.println("Fan On");
	}
	
	@Override
	public void off() {
		this.speed=OFF;
		System.out.println("Fan Off");
	}
	
	public int getSpeed() {
		return this.speed;
	}
}

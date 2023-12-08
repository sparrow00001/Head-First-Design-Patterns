package com.codingsparrows.pattern.command;

public class TableLamp implements Device{
	
	@Override
	public void on() {
		
		System.out.println("Table Lamp is switched ON");
	}
	
	@Override
	public void off() {
		System.out.println("Table Lamp is switched off");
	}
}

package com.codingsparrows.pattern.command;

public class NoCommand implements Command{

	@Override
	public void execute() {
		
		System.out.println("No Device is associated with this slot, Please assign a device to it");
	}
	@Override
	public void undo() {
		
		System.out.println("No device is associated with this slot, Please assign any device to it ");
	}
}

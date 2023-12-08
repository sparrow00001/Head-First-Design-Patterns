package com.codingsparrows.pattern.command;

public class NoCommand extends Command{

	@Override
	public void execute() {
		
		System.out.println("No Device is associated with this slot, Please assign a device to it");
	}
}

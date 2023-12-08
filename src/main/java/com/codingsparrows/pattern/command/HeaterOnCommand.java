package com.codingsparrows.pattern.command;

public class HeaterOnCommand extends Command{
	
	public HeaterOnCommand(Device device) {
	this.device=device;
	}
	@Override
	public void execute() {
		
		this.device.on();
	}
}

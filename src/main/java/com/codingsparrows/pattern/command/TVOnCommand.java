package com.codingsparrows.pattern.command;

public class TVOnCommand implements Command	{
	
	Device device;
	
	public TVOnCommand(Device device) {
	this.device=device;
	}
	
	@Override
	public void execute() {
		
		this.device.on();
	}
	
	@Override
	public void undo() {
		
		this.device.off();
	}
}

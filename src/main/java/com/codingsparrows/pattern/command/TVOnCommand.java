package com.codingsparrows.pattern.command;

public class TVOnCommand extends Command	{
	
	public TVOnCommand(Device device) {
	this.device=device;
	}
	
	@Override
	public void execute() {
		
		this.device.on();
	}
}

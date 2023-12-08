package com.codingsparrows.pattern.command;

public class FanOnCommand extends Command{
	
	public FanOnCommand(Device device) {
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		device.on();
	}
}

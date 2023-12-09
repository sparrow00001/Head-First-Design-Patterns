package com.codingsparrows.pattern.command;

public class FanOffCommand implements Command{
	Device device;
	
	public FanOffCommand(Device device) {
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		device.off();
	}

	@Override
	public void undo() {
		this.device.on();
	}
	
	
}

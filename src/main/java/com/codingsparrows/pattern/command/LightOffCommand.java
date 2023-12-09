package com.codingsparrows.pattern.command;

public class LightOffCommand implements Command {
	
	Device device;
	public LightOffCommand(Device device) {
		
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		this.device.off();
	}

	@Override
	public void undo() {
		
		this.device.on();
	}
}

package com.codingsparrows.pattern.command;

public class LightOffCommand extends Command {
	
	public LightOffCommand(Device device) {
		
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		this.device.off();
	}
}

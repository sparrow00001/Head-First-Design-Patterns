package com.codingsparrows.pattern.command;

public class ACOffCommand extends Command {
	
	
	public ACOffCommand(Device device) {
	this.device=device;
	}
	
	@Override
	public void execute() {
		device.off();
	}
}

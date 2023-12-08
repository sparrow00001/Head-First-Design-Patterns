package com.codingsparrows.pattern.command;

public class TVOffCommand extends Command{
	
	public TVOffCommand(Device device) {
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		this.device.off();
	}
}

package com.codingsparrows.pattern.command;

public class TVOffCommand implements Command{
	
	Device device;
	
	public TVOffCommand(Device device) {
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

package com.codingsparrows.pattern.command;

public class HeaterOffCommand extends Command{
	
	public HeaterOffCommand(Device device) {
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		device.off();
	}
}

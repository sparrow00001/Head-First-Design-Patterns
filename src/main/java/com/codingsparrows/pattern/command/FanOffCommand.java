package com.codingsparrows.pattern.command;

public class FanOffCommand extends Command{
	
	public FanOffCommand(Device device) {
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		device.off();
	}
}

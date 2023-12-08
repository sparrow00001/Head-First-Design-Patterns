package com.codingsparrows.pattern.command;

public class DoorCloseCommand extends Command{
	
	public DoorCloseCommand(Device device) {
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		device.off();
	}
}

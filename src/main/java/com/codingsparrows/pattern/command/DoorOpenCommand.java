package com.codingsparrows.pattern.command;

public class DoorOpenCommand extends Command{

	public DoorOpenCommand(Device device) {
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		device.on();
	}
}

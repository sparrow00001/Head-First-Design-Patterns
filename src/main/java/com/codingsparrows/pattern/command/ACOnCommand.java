package com.codingsparrows.pattern.command;

public class ACOnCommand extends Command{
	
	public ACOnCommand(Device device) {
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		device.on();
	}
}

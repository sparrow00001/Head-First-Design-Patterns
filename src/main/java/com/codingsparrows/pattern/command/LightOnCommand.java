package com.codingsparrows.pattern.command;

public class LightOnCommand extends Command	 {
	
	public LightOnCommand(Device device) {
			
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		this.device.on();
	}
}

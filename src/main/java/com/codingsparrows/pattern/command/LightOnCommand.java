package com.codingsparrows.pattern.command;

public class LightOnCommand implements Command	 {
	
	Device device;
	
	public LightOnCommand(Device device) {
			
		this.device=device;
	}
	
	@Override
	public void execute() {
		
		this.device.on();
	}
	
	@Override
	public void undo() {
		
		this.device.off();
	}
}

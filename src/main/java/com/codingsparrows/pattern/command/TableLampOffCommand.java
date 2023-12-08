package com.codingsparrows.pattern.command;

public class TableLampOffCommand extends Command {
	
	public TableLampOffCommand(Device device) {
		this.device=device;
		}
	
	@Override
	public void execute() {
		
		this.device.off();
	}
}

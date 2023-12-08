package com.codingsparrows.pattern.command;

public class TableLampOnCommand extends Command{

	public TableLampOnCommand(Device device) {
		this.device=device;
	}
	
	@Override
	public void execute() {
	this.device.on();
	}
}

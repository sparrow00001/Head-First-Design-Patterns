package com.codingsparrows.pattern.command;

public abstract class Command {
	
	Device device;
	
	public abstract void execute();
}

package com.codingsparrows.pattern.command;

public interface  Command {
	
	
	public abstract void execute();
	
	public abstract void undo();
}

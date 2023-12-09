package com.codingsparrows.pattern.command;

public class Remote {
	
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public Remote() {
		
		onCommands= new Command[7];
		offCommands= new Command[7];
		
		NoCommand noCommand= new NoCommand();
		for(int i=0;i<=6;i++) {
			onCommands[i]= noCommand;
			offCommands[i]=noCommand;
		}
		undoCommand=noCommand;
	}
	public void setCommand(int slot, Command onCommand, Command offCommand ) {
		onCommands[slot]=onCommand;
		offCommands[slot]=offCommand;
	}
	
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand=onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand=onCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
}

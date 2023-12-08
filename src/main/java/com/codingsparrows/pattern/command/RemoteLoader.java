package com.codingsparrows.pattern.command;

public class RemoteLoader {
	
	public static void main(String[] args) {
		Remote myRemote= new Remote();
		
		Light light= new Light();
		Fan fan= new Fan();
		TV tv= new TV();
		AC ac= new AC();
		Door door= new Door();
		LightOnCommand lightOnCommand= new LightOnCommand(light);
		LightOffCommand lightOffCommand= new LightOffCommand(light);
		FanOnCommand fanOnCommand= new FanOnCommand(fan);
		FanOffCommand fanOffCommand= new FanOffCommand(fan);
		TVOnCommand tvOnCommand= new TVOnCommand(tv);
		TVOffCommand offCommand= new TVOffCommand(tv);
		myRemote.setCommand(0, tvOnCommand,offCommand);
		myRemote.setCommand(1, lightOnCommand, lightOffCommand);
		myRemote.setCommand(2, fanOnCommand, fanOffCommand);
		
		myRemote.onButtonWasPushed(5);
		
	}

}

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
		FanHighCommand fanOnCommand= new FanHighCommand(fan);
		FanMediumCommand fanMediumCommand= new FanMediumCommand(fan);
		FanOffCommand fanOffCommand= new FanOffCommand(fan);
		TVOnCommand tvOnCommand= new TVOnCommand(tv);
		TVOffCommand offCommand= new TVOffCommand(tv);
		myRemote.setCommand(0, tvOnCommand,offCommand);
		myRemote.setCommand(1, lightOnCommand, lightOffCommand);
		myRemote.setCommand(2, fanOnCommand, fanOffCommand);
		myRemote.setCommand(3, fanMediumCommand, fanOffCommand);
		//myRemote.setCommand(3, ()->ac.on() , ()->ac.off());  Command interface is no more a functional interface so we can not provide function object 
		
		myRemote.onButtonWasPushed(3);
		myRemote.onButtonWasPushed(1);
		myRemote.onButtonWasPushed(2);
		myRemote.undoButtonWasPushed();
		
		
		
	}

}

package com.codingsparrows.pattern.command;

public class FanHighCommand implements Command{
	Fan fan;
	private int prevSpeed;
	
	
	public FanHighCommand(Fan fan) {
		this.fan=fan;
	}
	
	@Override
	public void execute() {
		prevSpeed= this.fan.getSpeed();
		this.fan.high();
		
		System.out.println("Fan is running on Hight Speed");
	}

	@Override
	public void undo() {
		System.out.println("Lets undo the fan speed");
		if(prevSpeed == this.fan.HIGH) {
			this.fan.high();
			System.out.println("fan speed is High");
		}
		else if(prevSpeed== this.fan.MEDIUM) {
			this.fan.medium();
			System.out.println("Fan speed is Medium");
		}
		else if(prevSpeed== this.fan.LOW) {
			this.fan.low();
			System.out.println("Fan speed is low");
		}
		else {
			this.fan.off();
			System.out.println("Fan is off");
		}	
	}
}

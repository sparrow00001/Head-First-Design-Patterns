package com.codingsparrows.pattern.command;

public class AC  implements Device	{
	
	@Override
	public void on() {
		
		System.out.println("AC On");
	}
	
	@Override
	public void off() {
		System.out.println("Ac Off");
	}
}

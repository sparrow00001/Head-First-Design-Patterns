package com.codingsparrows.pattern.abstractFactory;

public abstract class TicketGenerator {
	
	public abstract String getId();
	public abstract String getTicketMaterial();
	public abstract String getFrom();
	public abstract String getTo();
	public abstract float getFare();
	public abstract String getMetroName();
	public abstract String getTicketType();

}

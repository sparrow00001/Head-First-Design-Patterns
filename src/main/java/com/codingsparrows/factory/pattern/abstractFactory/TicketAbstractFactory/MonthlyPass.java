package com.codingsparrows.factory.pattern.abstractFactory.TicketAbstractFactory;

public class MonthlyPass extends Ticket{
	
	
	public MonthlyPass(TicketGenerator generator) {
		to=generator.getTo();
		from=generator.getFrom();
		fare=generator.getFare();
		metroName=generator.getMetroName();
		ticketId=generator.getId();
		ticketMaterial =generator.getTicketMaterial();
		ticketType=generator.getTicketType();
	}
	
	
	
}

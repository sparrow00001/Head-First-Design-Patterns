package com.codingsparrows.factory.pattern.TicketAbstractFactory;

public class AirportTicket extends Ticket{
	
	TicketGenerator  generator;
	
	public AirportTicket(TicketGenerator generator) {
		to=generator.getTo();
		from=generator.getFrom();
		fare=generator.getFare();
		metroName=generator.getMetroName();
		ticketId=generator.getId();
		ticketMaterial =generator.getTicketMaterial();
		ticketType=generator.getTicketType();
	}
	
}

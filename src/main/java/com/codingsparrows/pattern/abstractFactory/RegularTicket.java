package com.codingsparrows.pattern.abstractFactory;

public class RegularTicket extends Ticket{
	
	
	
	public RegularTicket(TicketGenerator generator) {
		to=generator.getTo();
		from=generator.getFrom();
		fare=generator.getFare();
		metroName=generator.getMetroName();
		ticketId=generator.getId();
		ticketMaterial =generator.getTicketMaterial();
		ticketType=generator.getTicketType();
		
	}
	
	

	
}

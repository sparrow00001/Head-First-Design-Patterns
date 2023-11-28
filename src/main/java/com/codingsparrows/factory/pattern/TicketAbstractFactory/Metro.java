package com.codingsparrows.factory.pattern.TicketAbstractFactory;

public abstract class Metro {
		
	public Ticket orderTicket(TicketType t) {
		System.out.println("Lets, start ordering the ticket..!!");
		return generateTicket(t);
	}
	
	public abstract Ticket generateTicket(TicketType t);
}

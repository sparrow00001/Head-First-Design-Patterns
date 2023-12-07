package com.codingsparrows.factory.pattern.abstractFactory.TicketAbstractFactory;

public class DelhiMetroTicketGenerator extends TicketGenerator {
	TicketType ticketType;
	
	public DelhiMetroTicketGenerator(TicketType t) {
		ticketType=t;
	}
	
	@Override
	public String getId() {
		System.out.println("Getting Ticket ID");
		return Math.round(Math.random() *1000000)+"DMRC";
	}

	@Override
	public String getTicketMaterial() {
		System.out.println("Plastic Coin is used in the DMRC");
		return "Plastic coin";
	}

	@Override
	public String getFrom() {
		System.out.println("Journey starts from "+ ticketType.getFrom());
		return ticketType.getFrom();
	}

	@Override
	public String getTo() {
		System.out.println("Journey ends at "+ ticketType.getTo());
		return ticketType.getTo();
	}

	@Override
	public float getFare() {
		System.out.println("It costs only 60 INR for this ticket");
		return 60.00f;
	}

	@Override
	public String getMetroName() {
		System.out.println("DMRC wishes you a very happy Journey");
		return "DMRC";
	}

	@Override
	public String getTicketType() {
		System.out.println("It is a "+ ticketType.getType() +" ticket.");
		return ticketType.getType();
	}

		
}

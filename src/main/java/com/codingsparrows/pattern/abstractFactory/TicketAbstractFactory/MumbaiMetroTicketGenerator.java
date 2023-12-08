package com.codingsparrows.pattern.abstractFactory.TicketAbstractFactory;

public class MumbaiMetroTicketGenerator extends TicketGenerator {

	TicketType ticketType;

	public MumbaiMetroTicketGenerator(TicketType t) {
		ticketType=t;
	}

	@Override
	public String getId() {
		System.out.println("Getting Ticket ID");
		return Math.round(Math.random() * 1000000) + "MMRC";
	}

	@Override
	public String getTicketMaterial() {
		System.out.println("Plastic Coin is used in the MMRC");
		return "Plastic coin";
	}

	@Override
	public String getFrom() {
		System.out.println("Journey starts from " + ticketType.getFrom());
		return ticketType.getFrom();
	}

	@Override
	public String getTo() {
		System.out.println("Journey ends at " + ticketType.getTo());
		return ticketType.getTo();
	}

	@Override
	public float getFare() {
		System.out.println("It costs only 100 INR for this ticket");
		return 100.00f;
	}

	@Override
	public String getMetroName() {
		System.out.println("MMRC wishes you a very happy Journey");
		return "MMRC";
	}

	@Override
	public String getTicketType() {
		System.out.println("It is a " + ticketType.getType() + " ticket.");
		return ticketType.getType();
	}

}

package com.codingsparrows.pattern.abstractFactory.TicketAbstractFactory;

public class MumbaiMetro extends Metro {

	@Override
	public Ticket generateTicket(TicketType t) {
		TicketGenerator generator = new MumbaiMetroTicketGenerator(t);
		Ticket ticket = null;

		System.out.println("Welcome at Mumbai Metro ");
		if (t == null) {
			System.out.println("Ticket type can not be blank..!!");
		} else if (t.type.equalsIgnoreCase("regular")) {
			System.out.println("You have choosen the regular ticket at MMRC");
			ticket = new RegularTicket(generator);
		} else if (t.type.equalsIgnoreCase("pass")) {
			System.out.println("You have choosen the monthly pass at MMRC");
			ticket = new MonthlyPass(generator);
		} else if (t.type.equalsIgnoreCase("airport")) {
			System.out.println("You have choosen the airport ticket at MMRC");
			ticket = new AirportTicket(generator);
		} else {
			System.out.println("Please choose a vaild ticket System");
			ticket = null;
		}
		return ticket;
	}

}

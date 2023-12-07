package com.codingsparrows.factory.pattern.abstractFactory.TicketAbstractFactory;

public class Passanger {

	public static void main(String[] args) {

		Metro metro = new DelhiMetro();
		Ticket t = metro.orderTicket(new TicketType("Delhi", "Gurugram", "airport"));
		System.out.println(t);
		
		Metro metro2 = new KolkataMetro();
		Ticket t1 = metro2.orderTicket(new TicketType("A", "B", "regular"));
		System.out.println(t1);
	}

}

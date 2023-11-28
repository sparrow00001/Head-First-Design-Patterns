package com.codingsparrows.factory.pattern.TicketAbstractFactory;

public class TicketType {
	
	String from;
	String to;
	String type;
	
	public TicketType(String from, String to, String type) {
		this.from=from;
		this.to=to;
		this.type=type;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TicketType [from=" + from + ", to=" + to + ", type=" + type + "]";
	}
	
	
	
}

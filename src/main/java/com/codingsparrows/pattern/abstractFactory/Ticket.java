package com.codingsparrows.pattern.abstractFactory;

public abstract class Ticket {

	String from;
	String to;
	float fare;
	String ticketId;
	String ticketType;
	String metroName;
	String ticketMaterial;

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketMaterial() {
		return ticketMaterial;
	}

	public void setTicketMaterial(String ticketMaterial) {
		this.ticketMaterial = ticketMaterial;
	}

	public String getMetroName() {
		return metroName;
	}

	public void setMetroName(String metroName) {
		this.metroName = metroName;
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

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	@Override
	public String toString() {
		return "Ticket [from=" + from + ", to=" + to + ", fare=" + fare + ", ticketId=" + ticketId + ", ticketType="
				+ ticketType + ", metroName=" + metroName + ", ticketMaterial=" + ticketMaterial + "]";
	}

}

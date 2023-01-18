package com.program.designpattern.singleton.example1;

public class MovieEager {
	static int noOfTickets;
	static int availableTickets;
	static int noOfBooking;
	static MovieEager movieEager = new MovieEager(100);
	private MovieEager (int Tickets) {
		noOfTickets = Tickets;
	}
	public static MovieEager bookTickets(int noOfTickets) {
		System.out.println("noOfTickets" + availableTickets);
		if (noOfTickets>availableTickets) {
			System.out.println("tickets not available");
		}
		if (noOfBooking>noOfTickets) {
			System.out.println("tickets not available");
			return movieEager;
		}
		noOfTickets -= noOfBooking;
		System.out.println("tickets left" + noOfTickets);
		return movieEager;
	}

}

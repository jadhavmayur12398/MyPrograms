package com.program.designpattern.singleton.example;

public class MovieLazy {
	static int noOfTickets;
	static MovieLazy movieLazy;
	private MovieLazy(int noOfTickets) {
//		this.noOfTickets = noOfTickets;
		MovieLazy.noOfTickets = noOfTickets;
	}
	public static MovieLazy bookTickets(int noOfBookings) {
		if (movieLazy==null) {
			movieLazy = new MovieLazy(100);
		}
		System.out.println("available tickets" + noOfTickets);
		System.out.println("Booking" + noOfBookings + "tickets");
		if (noOfBookings>noOfTickets) {
			System.out.println("tickets not available");
			return movieLazy;
		}
		
		noOfTickets -= noOfBookings;
		System.out.println("tickets left:" + noOfTickets);
		return movieLazy;
	}
}

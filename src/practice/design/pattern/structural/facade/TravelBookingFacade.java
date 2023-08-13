package practice.design.pattern.structural.facade;

import java.util.Date;

/**
 * Facade class which will expose all of the required functionality of Travel
 * Booking System
 * 
 * @author Akash Sharma
 *
 */
public class TravelBookingFacade {
	private HotelBookingSystem hotelBookingSystem;
	private FlightBookingSystem flightBookingSystem;

	public TravelBookingFacade() {
		hotelBookingSystem = new HotelBookingSystem();
		flightBookingSystem = new FlightBookingSystem();
	}

	public void reserveHotel(String hotelName, Date checkIn, Date checkOut) {
		hotelBookingSystem.reserveHotel(hotelName, checkIn, checkOut);
	}

	public void bookFlight(String from, String to, Date date) {
		flightBookingSystem.bookFlight(from, to, date);
	}
}

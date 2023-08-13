package practice.design.pattern.structural.facade;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Concrete class to perform Hotel Reservation
 * 
 * @author Akash Sharma
 *
 */
public class HotelBookingSystem {
	public void reserveHotel(String hotelName, Date checkIn, Date checkOut) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String formattedCheckIn = sdf.format(checkIn);
		String formattedCheckOut = sdf.format(checkOut);
		System.out.printf("Hotel %s booked from %s to %s", hotelName, formattedCheckIn, formattedCheckOut);
	}
}

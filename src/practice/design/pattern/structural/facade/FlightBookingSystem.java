package practice.design.pattern.structural.facade;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Concrete class to perform Flight booking
 * 
 * @author Akash Sharma
 *
 */
public class FlightBookingSystem {
	public void bookFlight(String from, String to, Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String formattedDate = sdf.format(date);
		System.out.printf("Flight booked from %s to %s on %s \n", from, to, formattedDate);
	}
}

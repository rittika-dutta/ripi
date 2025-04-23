package lambda;

import java.util.ArrayList;
import java.util.List;

public class driver {

    public static void main(String[] args) {
    	
    	FlightSchedule manager = new FlightSchedule();

        // Creating Domestic Flights
        DomesticFlight domestic1 = new DomesticFlight(101, "08:00", "10:00", 5, "WB");
        DomesticFlight domestic2 = new DomesticFlight(102, "12:00", "14:30", 3, "MH");

        // Creating International Flights
        InternationalFlight international1 = new InternationalFlight(201, "09:30", "13:30", 4, "US");
        InternationalFlight international2 = new InternationalFlight(202, "16:00", "22:00", 2, "UK");

        // Adding Flights to the Manager
        manager.addFlight(domestic1);
        manager.addFlight(domestic2);
        manager.addFlight(international1);
        manager.addFlight(international2);

        System.out.println("\n--- Attempting Bookings ---");

        // Booking Seats
        manager.bookFlight(101, 2);  // should succeed
        manager.bookFlight(201, 3);  // should succeed
        manager.bookFlight(202, 5);  // should fail (only 2 seats available)

        System.out.println("\n--- Available Flights Between 08:00 and 20:00 ---");
        manager.getAvailableFlight("08:00", "20:00");

        System.out.println("\n--- Available Flights Between 14:00 and 23:00 ---");
        manager.getAvailableFlight("14:00", "23:00");
    }
}

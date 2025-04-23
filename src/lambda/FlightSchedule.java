package lambda;

import java.util.ArrayList;
import java.util.List;

public class FlightSchedule {
	private List<Flight> list;

	public FlightSchedule(){
		list= new ArrayList<>(); 
	}

	public void addFlight(Flight flight) {
		list.add(flight);
		System.out.println("Flight added successfully with FlightId: "+flight.getFlightId());
	}

	public boolean bookFlight(int flightId, int count) {
		for (Flight flight : list) {
			if (flight.getFlightId() == flightId) {
				if (flight.getAvailableSeats() >= count) {
					flight.setAvailableSeats(flight.getAvailableSeats() - count);
					System.out.println(count + " seat(s) booked on Flight ID: " + flightId);
					return true;
				} else {
					System.out.println("Not enough seats available on Flight ID: " + flightId);
					return false;
				}
			}
		}
		System.out.println("Flight ID " + flightId + " not found.");
		return false;
	}

	public void getAvailableFlight(String start, String end) {
		boolean found = false;

		for (Flight flight : list) {
			if (flight.isAvailable()) {
				String dep = flight.getDepartureTime();
				String arr = flight.getArrivalTime();

				if (dep.compareTo(start) >= 0 && arr.compareTo(end) <= 0) {
					flight.getFlightInfo();
					System.out.println("----------------------");
					found = true;
				}
			}
		}

		if (!found) {
			System.out.println("No available flights found between " + start + " and " + end);
		}

	}
}



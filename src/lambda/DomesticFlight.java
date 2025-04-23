package lambda;

public class DomesticFlight extends Flight{
	
	private String stateCode;
	
	DomesticFlight(int flightId, String departureTime, String arrivalTime, int availableSeats,String stateCode) {
		super(flightId, departureTime, arrivalTime, availableSeats);
		this.stateCode=stateCode;
		// TODO Auto-generated constructor stub
	}

	
	
	public String getStateCode() {
		return stateCode;
	}



	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}



	@Override
	void bookSeats() {
	    if(isAvailable()) {
	        setAvailableSeats(getAvailableSeats() - 1);
	        System.out.println("Seat booked on Domestic Flight.");
	    } else {
	        System.out.println("No seats available.");
	    }
	}

	@Override
	boolean isAvailable() {
		// TODO Auto-generated method stub
		return getAvailableSeats()>0;
	}

	@Override
	void getFlightInfo() {
		// TODO Auto-generated method stub
		System.out.println("Flight Id: "+getFlightId());
		System.out.println("Departure Time: "+getDepartureTime());
		System.out.println("Arrival Time: "+getArrivalTime());
		System.out.println("Available Seats: "+getAvailableSeats());
		System.out.println("State Code: "+stateCode);
	}

}



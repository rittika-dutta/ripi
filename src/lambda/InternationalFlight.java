package lambda;

public class InternationalFlight extends Flight{
	
private String countryCode;
	
	InternationalFlight(int flightId,String departureTime,String arrivalTime,int availableSeats,String countryCode){
		super( flightId, departureTime, arrivalTime, availableSeats);
		this.countryCode=countryCode;
	}

	
	
	public String getCountryCode() {
		return countryCode;
	}



	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}



	@Override
	void bookSeats() {
		// TODO Auto-generated method stub
		if(isAvailable()) {
	        setAvailableSeats(getAvailableSeats() - 1);
	        System.out.println("Seat booked on International Flight.");
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
		System.out.println("State Code: "+countryCode);
	}
}



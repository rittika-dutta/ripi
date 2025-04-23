package lambda;

abstract class Flight {
	private int flightId;
	private String departureTime;
	private String arrivalTime;
	private int availableSeats;
	
	Flight(int flightId,String departureTime,String arrivalTime,int availableSeats){ 
	        this.flightId = flightId;
	        this.departureTime = departureTime;
	        this.arrivalTime = arrivalTime;
	        this.availableSeats = availableSeats;
	    }
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	abstract void bookSeats();
	abstract boolean isAvailable();
	abstract void getFlightInfo();
}
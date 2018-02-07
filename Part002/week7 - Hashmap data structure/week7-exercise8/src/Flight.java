import java.util.HashMap;


public class Flight {
	private String deperature;
	private String destination;
	public HashMap<String, String>flights = new HashMap<String, String>();
	
	public Flight(String inputDeperature, String inputDestination) {
		this.deperature = inputDeperature;
		this.destination = inputDestination;
		this.flights.put(inputDeperature, inputDestination);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.deperature + "-" + this.destination+")";
	}

}

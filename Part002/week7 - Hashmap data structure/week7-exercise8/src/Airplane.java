import java.util.ArrayList;
import java.util.HashMap;

import com.sun.glass.ui.TouchInputSupport;

public class Airplane {
	private String id;
	private String capacity;
	private ArrayList<Flight>flights = new ArrayList<Flight>();

	public Airplane(String inputId, String inputCapactity) {
		this.id = inputId;
		this.capacity = inputCapactity;
	}
	public String getId() {
		return this.id;
	}
	public String capactity() {
		return this.capacity;
	}
	
	public void setFlight(String inputDeperature, String inputDestination) {
		Flight newFlight = new Flight(inputDeperature, inputDestination);
		flights.add(newFlight);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " (" + this.capacity + ")";
	}
	public String toStringWithFlight() {
		return this.id + " (" + this.capacity + ")" + this.flights.toString();
	}


}

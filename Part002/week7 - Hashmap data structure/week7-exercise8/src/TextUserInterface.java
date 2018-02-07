import java.util.ArrayList;
import java.util.Scanner;

public class TextUserInterface {
	private Scanner input;
	private ArrayList<Airplane>airplanes = new ArrayList<Airplane>();
	
	public TextUserInterface(Scanner inputScanner) {
		this.input = inputScanner;
	}
	public void start() {
		System.out.println("Airport panel");
		System.out.println("-----------------");
		while (true) {
			System.out.println("Choose operation: ");
			System.out.println("[1] Add airplane");
			System.out.println("[2] Add flight");
			System.out.println("[x] Exit");
			String command = input.nextLine();
			if (command.equals("1")) {
				addAirplane();
			}
			else if (command.equals("2")) {
				addFlight();
			}	
			else if (command.equals("x") ) {
				break;
			}
			else {
				break;
			}
		}
		flightService();
	}
	
	private void flightService() {
		while (true) {
			System.out.println("Choose operation: ");
			System.out.println("[1] Print planes");
			System.out.println("[2] Print flights");
			System.out.println("[3] Print plane info");
			System.out.println("[x] Quit");
			String command = input.nextLine();
			if (command.equals("1")) {
				printPlanes();
			}
			else if (command.equals("2")) {
				printFlights();
			}	
			else if (command.equals("3")) {
				printPlaneInfo();
			}
			else if (command.equals("x") ) {
				break;
			}
			else {
				break;
			}
		}
		
	}
	private void printPlanes() {
		for (Airplane airplane : airplanes) {
			System.out.println(airplane.toString());
		}
		
	}
	private void printPlaneInfo() {
		System.out.println("Give plane ID: ");
		String id = input.nextLine();
		for (Airplane airplane : airplanes) {
			if (airplane.toString().contains(id)) {
				System.out.println(airplane.toString());
			}
			else {
				continue;
			}
		}
		
	}
	private void printFlights() {
		for (Airplane airplane : airplanes) {
			airplane.toStringWithFlight();
		}
		
	}
	
	private void addAirplane() {
		String id;
		String capactity;
		Airplane newPlane;
		
		System.out.println("Give plane ID: ");
		id = input.nextLine();
		System.out.println("Give plane capacity: ");
		capactity = input.nextLine();
		newPlane = new Airplane(id, capactity);
		airplanes.add(newPlane);
	}
	
	private void addFlight() {
		String id;
		String deperatureCode;
		String destCode;

		System.out.println("Give plane ID: ");
		id = input.nextLine();
		System.out.println("Give deperature airport code: ");
		deperatureCode = input.nextLine();
		System.out.println("Give destination airport code: ");
		destCode = input.nextLine();
		for (Airplane airplane : airplanes) {
			if (airplane.toString().contains(id)) {
				airplane.setFlight(deperatureCode, destCode);
			}
			else {
				continue;
			}
		}
	}


}

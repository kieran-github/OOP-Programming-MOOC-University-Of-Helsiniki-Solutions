package phonesearch;


import java.util.ArrayList;
import java.util.Scanner;

public class TextInterface {
	private Scanner input;
	private String command;
	private ArrayList<Person>peopleDb;
	
	public TextInterface(Scanner inputScanner) {
		this.input = inputScanner;
		this.peopleDb = new ArrayList<Person>();
	}
	
	//entry
	public void start() {
		menu();
	}
	
	public void menu() {
		System.out.println("phone search");
		System.out.println("available operations:");
		System.out.println(" 1 add a number");
		System.out.println(" 2 search for a number");
		System.out.println(" 3 search for a person by phone number");
		System.out.println(" 4 add an address");
		System.out.println(" 5 search for personal information");
		System.out.println(" 6 delete personal information");
		System.out.println(" 7 filtered listing");
		System.out.println(" x quit");
		
		while (true) {
			System.out.print("command:");
			this.command = this.input.nextLine();
			if (command.equals("1")) {
				addNumber();
			}
			else if (command.equals("2")) {
				searchNumberByName();
			}
			else if (command.equals("3")) {
				searchPersonByNumber();
			}
			else if (command.equals("4")) {
				addAddress();
			}
			else if (command.equals("5")) {
				searchInfo();
			}
			else if (command.equals("6")) {
				deleteInfo();
			}
			else if (command.equals("7")) {
				filterList();
			}
			else {
				break;
			}
		}
	}
	
	//7
	private void filterList() {
		System.out.println("keyword (if empty, all listed):");
		String name = this.input.nextLine();
		if (name.equals("")) {
			for (Person person : peopleDb) {
				System.out.println(person.getName());
				System.out.println(person.getAddress());
				System.out.println(person.getCity());
				person.printNumbers();
			}
		}
		else {
			for (Person person : peopleDb) {
				if (person.getName().contains(name)) {
					System.out.println(person.getName());
					System.out.println(person.getAddress());
					System.out.println(person.getCity());
					person.printNumbers();
				}
			}
		}
	}
	
	//6
	private void deleteInfo() {
		System.out.println("whose info: ");
		String name = this.input.nextLine();
		for (Person person : peopleDb) {
			if (person.getName().equals(name)) {
				person.deleteMyInfo();
			}
		}
		
	}
	
	//5
	private void searchInfo() {
		System.out.println("Whose information: ");
		String name = this.input.nextLine();
		for (Person person : peopleDb) {
			if (person.getName().equals(name)) {
				System.out.println("address: " + person.getAddress());
				System.out.println("city: " + person.getCity());
				person.printNumbers();
			}
			else {
				System.out.println("not found");
			}
		}
		
	}
	
	//4
	private void addAddress() {
		System.out.println("Whose address: ");
		String name = this.input.nextLine();
		for (Person p : peopleDb) {
			if (p.getName().equals(name)) {
				System.out.println("street: ");
				String street = this.input.nextLine();
				p.addAddress(street);
				System.out.println("city: ");
				String city = this.input.nextLine();
				p.addCity(city);
			}
			else {
				System.out.println("not found");
			}
		}
	}
	
	//3
	private void searchPersonByNumber() {
		System.out.println("Number: ");
		String number = this.input.nextLine();
		for (Person p : peopleDb) {
			if (p.getNumbers().contains(number)) {
				System.out.println(p.getName());
			}
			else {
				continue;
			}
		}
		
	}
	
	//2
	private void searchNumberByName() {
		System.out.println("Whose number: ");
		String name = this.input.nextLine();
		System.out.println("phone numbers:");
		for (Person p : peopleDb) {
			if (p.getName().equals(name)) {
				p.printNumbers();
			}
			else {
				continue;
			}
		}
	}
	
	//1
	private void addNumber() {
		boolean flag = false;
		System.out.println("Whose Number: ");
		String name = this.input.nextLine();
		System.out.println("Number: ");
		String phoneNumber = this.input.nextLine();
		for (Person p : this.peopleDb) {
			if (p.getName().equals(name)) {
				flag = true;
				p.addPhoneNumber(phoneNumber);
			}
		}
		if (flag != true) {
			Person nPerson = new Person(name);
			nPerson.addPhoneNumber(phoneNumber);
			this.peopleDb.add(nPerson);
		}
	}
}

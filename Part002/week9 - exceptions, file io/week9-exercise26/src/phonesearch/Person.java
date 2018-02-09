package phonesearch;

import java.util.HashSet;
import java.util.Set;

public class Person {
	private String name;
	private Set<String>phoneNumbers;
	private String address = null;
	private String city = null;
	
	public Person(String inputName) {
		this.name = inputName;
		this.phoneNumbers = new HashSet<String>();
	}
	public void addPhoneNumber(String inputPhoneNumber) {
		if (!this.phoneNumbers.contains(inputPhoneNumber)) {
			this.phoneNumbers.add(inputPhoneNumber);
		}
	}
	public void addAddress(String newAddress) {
		this.address = newAddress;
	}
	public void addCity(String newCity) {
		this.city = newCity;
	}
	
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public String getCity() {
		return this.city;
	}
	public Set<String> getNumbers(){
		return this.phoneNumbers;
	}
	
	public void deleteMyInfo() {
		this.phoneNumbers.clear();
		this.address = "";
		this.city = "";
		
	}
	
	public void printNumbers() {
		for (String pn : phoneNumbers) {
				System.out.println(pn);
		}
	}
}

package people;

public class Person {
	private String name;
	private String address;
	
	public Person(String inputName, String inputAddress) {
		this.name = inputName;
		this.address = inputAddress;
	}
	@Override
	public String toString() {
		return this.name + "\n" + "   " + this.address;
	}

}

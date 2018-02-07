
public class Person {
	private String name;
	private String number;
	
	public Person(String inputName, String inputNumber) {
		this.name = inputName;
		this.number = inputNumber;
	}
	public String getName() {
		return this.name;
	}
	public String getNumber() {
		return this.number;
	}
	public void changeNumber(String newNumber) {
		this.number = newNumber;
	}
	
	@Override
	public String toString() {
		return this.name + " Number: " + this.number;
	}

}

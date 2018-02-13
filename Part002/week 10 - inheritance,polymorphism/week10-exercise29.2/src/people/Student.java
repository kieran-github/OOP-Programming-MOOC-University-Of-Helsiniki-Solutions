package people;

public class Student extends Person{
	private int credits;
	public Student(String inputName, String inputAddress) {
		super(inputName, inputAddress);
		this.credits = 0;
	}
	public void study() {
		this.credits+=1;
	}
	public int credits() {
		return this.credits;
	}
	@Override
	public String toString() {
		String buffer = ""; 
		buffer += super.toString();
		return buffer;
	}

}

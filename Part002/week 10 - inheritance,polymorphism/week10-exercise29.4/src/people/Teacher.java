package people;

public class Teacher extends Person{
	private int salary;
	
	public Teacher(String inputName, String inputAddress, int inputSalary) {
		super(inputName, inputAddress);
		this.salary = inputSalary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + "   salary " + this.salary + " euros/month";
	}

}


public class Student {
	private String name;
	private String studentNumber;
	
	public Student(String inputName, String inputStudentNumber) {
		this.name = inputName;
		this.studentNumber = inputStudentNumber;
	}
	public String getName() {
		return this.name;
	}
	public String getStudentNumber() {
		return this.studentNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + "(" + this.studentNumber + ")";
	}
}

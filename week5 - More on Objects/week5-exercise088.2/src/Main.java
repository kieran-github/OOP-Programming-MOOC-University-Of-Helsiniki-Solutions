import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static ArrayList<Student>students = new ArrayList<Student>();
	private static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
    	String name;
    	String studentNumber;
    	String searchTerm;
        while (true) {
			System.out.println("name: ");
			name = input.nextLine();
			System.out.println("studentnumber: ");
			studentNumber = input.nextLine();
			if (name.equals("") || studentNumber.equals("")) {
				for (Student s : students) {
					System.out.println(s.toString());
				}
				break;
			}
			else {
				Student student  = new Student(name, studentNumber);
				students.add(student);
			}
		}
    }
}
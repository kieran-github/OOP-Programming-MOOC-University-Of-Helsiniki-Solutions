import java.util.Scanner;

public class SumOfTheAges {
	private static Scanner input = new Scanner(System.in);
	private static String name1;
	private static String name2;
	private static int age1;
	private static int age2;
	private static int total;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type your name: ");
		name1 = input.nextLine();
		System.out.println("Type your age: ");
		age1 = input.nextInt();
		System.out.println("Type your name: ");
		name2 = input.next();
		System.out.println("Type your age: ");
		age2 = input.nextInt();
		total = age1 + age2;
		System.out.println(name1 + " and " + name2 + " are " + total + " in total.");
	}

}

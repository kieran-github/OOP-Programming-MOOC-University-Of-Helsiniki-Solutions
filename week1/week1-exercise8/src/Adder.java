import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class Adder {
	private static int num1;
	private static int num2;
	private static int result;
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a number: ");
		num1 = input.nextInt();
		System.out.println("Type another number: ");
		num2 = input.nextInt();
		result = num1 + num2;
		System.out.println("Some of the numbers: " + result);
	}

}

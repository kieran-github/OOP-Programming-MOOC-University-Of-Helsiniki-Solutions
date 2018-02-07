import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	private static ArrayList<Integer>grade0= new ArrayList<Integer>();
	private static ArrayList<Integer>grade1 = new ArrayList<Integer>();
	private static ArrayList<Integer>grade2 = new ArrayList<Integer>();
	private static ArrayList<Integer>grade3 = new ArrayList<Integer>();
	private static ArrayList<Integer>grade4 = new ArrayList<Integer>();
	private static ArrayList<Integer>grade5 = new ArrayList<Integer>();
	private static ArrayList<Integer>merged;
	private static ArrayList<Integer>merge2;
	private static Scanner input = new Scanner(System.in);
	
	private static String num1 = "0: ";
	private static String num2 = "1: ";
	private static String num3 = "2: ";
	private static String num4 = "3: ";
	private static String num5 = "4: ";
	private static String num6 = "5: ";
	private static int num;
	private static double average = 0;
	private static int sum = 0;
	private static int total = 0;
	public static void main(String[] args) {
		while (true) {
			System.out.println("Type exam scores, -1 completes: ");
			num = input.nextInt();
			if (num < 0 ) {
				break;
			}
			else if (num <= 29) {
				grade0.add(num);
			}
			else if (num <= 34) {
				grade1.add(num);
			}
			else if (num <= 39) {
				grade2.add(num);
			}
			else if (num <= 44) {
				grade3.add(num);
			}
			else if (num <= 49) {
				grade4.add(num);
			}
			else if (num <= 60) {
				grade5.add(num);
			}
		}
	merged = new ArrayList<Integer>();
	merged.addAll(grade1);
	merged.addAll(grade2);
	merged.addAll(grade3);
	merged.addAll(grade4);
	merged.addAll(grade5);
	
	//total with merged of accepted 
	merge2 = new ArrayList<Integer>();
	merge2.addAll(merged);
	merge2.addAll(grade0);
	for (Integer number : merge2) {
		total += number;
	}
	for (Integer i : merged) {
		sum += i;
	}
	for (Integer j : merge2) {
		total += j;
	}
	System.out.print(num6);
	
	for (Integer gr5 : grade5) {
		System.out.print("*");
	}
	System.out.println(" ");
	System.out.print(num5);
	
	for (Integer gr5 : grade4) {
		System.out.print("*");
	}
	System.out.println(" ");
	System.out.print(num4);
	
	for (Integer gr5 : grade3) {
		System.out.print("*");
	}
	System.out.println(" ");
	System.out.print(num3);
	
	for (Integer gr5 : grade2) {
		System.out.print("*");
	}
	System.out.println(" ");
	System.out.print(num2);
	
	for (Integer gr5 : grade1) {
		System.out.print("*");
	}
	System.out.println(" ");
	System.out.print(num1);
	
	for (Integer gr5 : grade0) {
		System.out.print("*");
	}
	average = 100 * ((double)sum / total);
	System.out.println(" ");
	System.out.println("Acceptance percentage: " + average);
	}
}

	

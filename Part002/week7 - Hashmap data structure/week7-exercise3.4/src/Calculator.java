import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.StackConsumer;

import sun.net.www.content.text.plain;

public class Calculator {
	private Scanner input = new Scanner(System.in);
	private String command;
	private int num1;
	private int num2;
	private int count  = 0;
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = input.next();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
            	count+=1;
                sum();
            } else if (command.equals("difference")) {
            	count+=1;
                difference();
            } else if (command.equals("product")) {
            	count+=1;
                product();
            }
        }
        statistics();
    }
    private void getNumbers() {
    	System.out.println("Value 1: ");
    	num1 = input.nextInt();
    	System.out.println("Value 2: ");
    	num2 = input.nextInt();
    	
    }
    	

	private void sum() {
		getNumbers();
		System.out.println("Sum of the values: " + (num1 + num2));
	}

	private void difference() {
		getNumbers();
		System.out.println("Difference of the values: " + (num1 - num2));
	}

	private void product() {
		getNumbers();
		System.out.println("Prouduct of the values: " + (num1 * num2));
	}
	
	private void statistics() {
		System.out.print("Calculations done: " + count);
	}
}

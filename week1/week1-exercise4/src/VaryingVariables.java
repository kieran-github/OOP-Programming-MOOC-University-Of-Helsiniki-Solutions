import com.sun.xml.internal.bind.v2.runtime.Name;

import sun.print.resources.serviceui;

public class VaryingVariables {
	private static int number;
	private static double kg;
	private static String name;

	public static void main(String[] args) {
		number = 9000;
		kg = 0.1;
		name = "Zetor";
		System.out.println("Chickens: \n"
				+ number);
		System.out.println("Bacon (kg): \n"
				+ kg);
		System.out.println("A tractor: \n"
				+ name);
		
		System.out.println("In a nutshell: " + "\n" +
				number + "\n"+
				kg + "\n" +
				name);

	}

}

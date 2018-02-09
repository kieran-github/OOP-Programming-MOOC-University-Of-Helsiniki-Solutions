package mooc;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
	    Printer printer = new Printer("src/textfile.txt");

	    printer.printLinesWhichContain("V�in�m�inen");
	    System.out.println("-----");
	    printer.printLinesWhichContain("Frank Zappa");
	    System.out.println("-----");
	    printer.printLinesWhichContain("");
	    System.out.println("-----");
	}
}

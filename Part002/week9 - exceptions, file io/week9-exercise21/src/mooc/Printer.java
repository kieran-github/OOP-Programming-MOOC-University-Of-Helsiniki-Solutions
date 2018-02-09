package mooc;

import java.awt.event.MouseWheelEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
	private Scanner input;
	File myFile;

	public Printer(String inputFileName) throws FileNotFoundException{
		this.myFile = new File(inputFileName);
	}
	public void printLinesWhichContain(String keyWord) throws FileNotFoundException {
		this.input = new Scanner(this.myFile);
		while (this.input.hasNext()) {
			String line = this.input.nextLine();
			if (line.contains(keyWord)) {
				System.out.println(line);
			}
			else {
				continue;
			}
		}
		this.input.close();
	}
}

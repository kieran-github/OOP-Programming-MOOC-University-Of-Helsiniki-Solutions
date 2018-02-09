package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
	private Scanner input;
	private int lineCount = 0;
	public Analysis(File inputFile) throws FileNotFoundException {
		this.input = new Scanner(inputFile);
	}
	public int lines() {
		while (this.input.hasNextLine()) {
			String line = this.input.nextLine();
			lineCount += 1;
		}
		return this.lineCount;
	}
}

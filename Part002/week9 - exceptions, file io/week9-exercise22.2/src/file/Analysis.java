package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Analysis {
	private Scanner input;
	private Scanner input2;
	private int lineCount = 0;
	private int chars = 0;

	public Analysis(File inputFile) throws FileNotFoundException {
		this.input = new Scanner(inputFile, "UTF-8");
		this.input2 = new Scanner(inputFile, "UTF-8");
	}
	public int lines() {
		while (this.input.hasNextLine()) {
			String line = this.input.nextLine();
			this.lineCount += 1;
		}
		return this.lineCount;
	}
	public int characters() {

        while (this.input2.hasNextLine()) {
			String line = this.input2.nextLine();
			chars += line.length();
		}
        return chars + lineCount;
	}
}

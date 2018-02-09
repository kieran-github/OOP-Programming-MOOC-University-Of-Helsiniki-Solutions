package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordInspection {
	private File fp;
	private String[] wordArray;
	private int wordCount = 0;
	
	public WordInspection(File inputFile) throws FileNotFoundException {
		this.fp = inputFile;
	}
	
	

	public int wordCount() throws FileNotFoundException{
		Scanner input = new Scanner(this.fp);
		while (input.hasNextLine()) {
			String line = input.nextLine();
			wordCount += 1;
		}
		input.close();
		return wordCount;
	}
}

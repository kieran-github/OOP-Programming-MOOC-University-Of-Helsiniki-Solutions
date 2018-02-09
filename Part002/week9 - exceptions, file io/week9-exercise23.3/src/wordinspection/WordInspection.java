package wordinspection;

import java.awt.List;
import java.util.*;

import org.omg.CORBA.OMGVMCID;

import java.io.File;
import java.io.FileNotFoundException;


public class WordInspection {
	private File fp;
	private String[] wordArray;
	private int wordCount = 0;
	private int wordLCount = 0;
	
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
	
	public ArrayList<String> wordEndingInL() throws FileNotFoundException{
		Scanner input = new Scanner(this.fp);
		ArrayList<String> wordsEndInL = new ArrayList<String>();
		while (input.hasNextLine()) {
			String line = input.nextLine().toLowerCase();
			if (line.endsWith("l")) {
				wordsEndInL.add(line);
			}
			else {
				continue;
			}
		}
		input.close();
		return wordsEndInL;
	}
}

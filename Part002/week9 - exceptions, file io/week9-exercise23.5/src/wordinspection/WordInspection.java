package wordinspection;

import java.awt.List;
import java.util.*;

import org.omg.CORBA.OMGVMCID;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;


public class WordInspection {
	private File fp;
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
	
	//23.4
	public String reverse(String inputString) {
		String reverseBuffer = "";
		for (int i = inputString.length()-1; i >= 0; i--) {
			reverseBuffer += inputString.charAt(i);
		}
		return reverseBuffer;
	}
	public ArrayList<String>palindromes() throws FileNotFoundException{
		Scanner input = new Scanner(this.fp);
		ArrayList<String>palindromes  = new ArrayList<String>();
		while (input.hasNext()) {
			String line = input.nextLine();
			if (line.equals(reverse(line))) {
				palindromes.add(line);
			}
			else {
				continue;
			}
		}
		return palindromes;
	}
	
	public ArrayList<String> vowels() throws FileNotFoundException{
		Scanner input = new Scanner(this.fp);
		ArrayList<String>vowels  = new ArrayList<String>();
		while (input.hasNextLine()) {
			String line = input.nextLine();
			 if(line.contains("a") && line.contains("e") && line.contains("i") && line.contains("o") && line.contains("u") && line.contains("y") && line.contains("ä") && line.contains("ö")){
	                vowels.add(line);
			}
			else {
				continue;
			}
		}
		return vowels;
	}
}

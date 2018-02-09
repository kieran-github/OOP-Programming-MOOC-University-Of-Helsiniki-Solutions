package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException{
		File myFp = new File("src/shortList.txt");
		WordInspection wi = new WordInspection(myFp);
		System.out.println(wi.wordCount());
	}
}

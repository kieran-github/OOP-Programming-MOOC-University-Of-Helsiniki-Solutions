package tools;

import java.util.Set;

public interface DuplicateRemover {
	public void add(String characterString);
	//stores a characterString if it's not a duplicate.
	public int getNumberOfDetectedDuplicates();
	//returns the number of detected duplicates.
	public Set<String> getUniqueCharacterStrings();
	//returns an object which implements the interface Set<String>. Object should have all unique characterStrings (no duplicates!). If there are no unique characterStrings, method returns an empty set.
	public void empty();
	//removes stored characterStrings and resets the amount of detected duplicates.
}

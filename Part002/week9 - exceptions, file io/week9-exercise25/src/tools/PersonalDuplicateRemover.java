package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover{
	private Set<String>mySet;
	private int number = 0;
	
	public PersonalDuplicateRemover() {
		this.mySet = new HashSet<String>();
	}
	
	@Override
	public void add(String characterString) {
		if (this.mySet.contains(characterString)) {
			number += 1;
		}
		else {
			this.mySet.add(characterString);
		}
		
	}

	@Override
	public int getNumberOfDetectedDuplicates() {
		return this.number;
	}

	@Override
	public Set<String> getUniqueCharacterStrings() {
		return this.mySet;
	}

	@Override
	public void empty() {
		this.mySet.removeAll(this.mySet);
		
		//flush
		this.number = 0;
	}
}

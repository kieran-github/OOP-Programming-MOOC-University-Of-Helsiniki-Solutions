package dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
	private Map<String, Set<String>>translations;
	
	public PersonalMultipleEntryDictionary() {
		this.translations = new HashMap<String, Set<String>>();
	}

	@Override
	public void add(String word, String translation) {
		if (!this.translations.containsKey(word)) {
			this.translations.put(word, new HashSet<String>());
		}
		this.translations.get(word).add(translation);
	}

	@Override
	public Set<String> translate(String word) {
		return this.translations.get(word);
	}

	@Override
	public void remove(String word) {
		this.translations.remove(word);
		
	}

	
}

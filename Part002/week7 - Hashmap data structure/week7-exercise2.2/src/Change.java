
public class Change {
	private char changedCharacter;
	private char toCharacter;
	
	public Change(char fromCharacter, char toCharacter) {
		this.changedCharacter = fromCharacter;
		this.toCharacter = toCharacter;
		
	}
	public String change(String characterString) {
		String changed = characterString.replace(this.changedCharacter, toCharacter);
		return changed;
	}

}

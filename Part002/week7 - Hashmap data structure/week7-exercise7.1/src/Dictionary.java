import java.util.HashMap;

public class Dictionary {
	private HashMap<String, String> myDic = new HashMap<String, String>();
	
	public String translate(String word) {
		if (myDic.containsKey(word)) {
			return myDic.get(word);
		}
		else {
			return null;
		}
	}
	public void add(String word, String translation) {
		myDic.put(word, translation);
	}
}

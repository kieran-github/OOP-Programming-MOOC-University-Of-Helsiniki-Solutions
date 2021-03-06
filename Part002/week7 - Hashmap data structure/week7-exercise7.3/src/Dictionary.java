import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
	private HashMap<String, String> myDic = new HashMap<String, String>();
	private int count = 0;
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
		count += 1;
	}
	public int amountOfWords() {
		return count;
	}
	public ArrayList<String> translationList(){
		ArrayList<String>buffer = new ArrayList<String>();
		for (String k : this.myDic.keySet()) {
			buffer.add(k + " = " + this.myDic.get(k));
		}
		return buffer;
	}
}

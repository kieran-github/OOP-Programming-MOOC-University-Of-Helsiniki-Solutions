import java.nio.Buffer;
import java.util.ArrayList;

public class Changer {
	private ArrayList<Change>changes = new ArrayList<Change>();
	private String buffer;
	public Changer() {
		// TODO Auto-generated constructor stub
	}
	public void addChange(Change change) {
		changes.add(change);
	}
    public String changeMultiple(String characterString) {
        String buffer = characterString;
        for (Change change : changes){
            buffer = change.change(buffer);
        }
        return buffer;
    }
}

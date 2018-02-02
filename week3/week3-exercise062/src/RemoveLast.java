import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("Dick");
		brothers.add("Henry");
		brothers.add("Michael");
		brothers.add("Bob");

		System.out.println("brothers:");
		System.out.println(brothers);

		// sorting brothers
		Collections.sort(brothers);

		// removing the last item
		removeLast(brothers);

		System.out.println(brothers);
	}
	private static void removeLast(ArrayList<String> list) {
		list.remove(list.size() -1);
	}

}

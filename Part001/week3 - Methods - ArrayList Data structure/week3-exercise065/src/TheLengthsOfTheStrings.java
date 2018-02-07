import java.util.ArrayList;

public class TheLengthsOfTheStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<String> list = new ArrayList<String>();
	    list.add("Hallo");
	    list.add("Moi");
	    list.add("Benvenuto!");
	    list.add("badger badger badger badger");
	    ArrayList<Integer> lengths = lengths(list);

	    System.out.println("The lengths of the Strings: " + lengths);

	}
	private static ArrayList<Integer> lengths(ArrayList<String> list){
		ArrayList<Integer> lengthsOfTheStrings = new ArrayList<Integer>();
		for (String string : list) {
			lengthsOfTheStrings.add(string.length());
		}
		return lengthsOfTheStrings;
	}

}

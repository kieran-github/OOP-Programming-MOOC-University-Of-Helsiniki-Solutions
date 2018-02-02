import java.util.ArrayList;


public class AmountOfItemsInAList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hallo");
		list.add("Ciao");
		list.add("Hello");
		System.out.println("There are this many items in the list:");
		System.out.println(countItems(list));
		    
	}
	private static int countItems(ArrayList<String> list) {
		return list.size();
	}

}

import java.util.ArrayList;

public class CombiningArrayLists {
	private static ArrayList<Integer> list1 = new ArrayList<Integer>();
	private static ArrayList<Integer> list2 = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list1.add(4);
		list1.add(3);

		list2.add(5);
		list2.add(10);
		list2.add(7);

		combine(list1, list2);

		System.out.println(list1); // prints [4, 3, 5, 10, 7]

		System.out.println(list2); // prints [5, 10, 7]
	}
	private static ArrayList<Integer> combine(ArrayList<Integer> list1,ArrayList<Integer> list2){
		list1.addAll(list2);
		return list1;
	}

}

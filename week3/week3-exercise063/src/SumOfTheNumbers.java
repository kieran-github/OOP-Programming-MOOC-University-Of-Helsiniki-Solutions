import java.util.ArrayList;

public class SumOfTheNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The sum: " + sum(list));

	    list.add(10);

	    System.out.println("the sum: " + sum(list));
	}
	private static int sum(ArrayList<Integer>list) {
		int sumOfIntList = 0;
		for (Integer i : list) {
			sumOfIntList += i;
		}
		return sumOfIntList;
	}

}

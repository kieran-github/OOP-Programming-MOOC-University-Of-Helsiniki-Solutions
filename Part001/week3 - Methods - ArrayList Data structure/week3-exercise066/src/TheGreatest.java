import java.util.ArrayList;

public class TheGreatest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);
	    System.out.println("The greatest number is: " + greatest(list));
	}
	private static int greatest(ArrayList<Integer> list) {
		int great = list.get(0);
		for (int i : list) {
			if (i > great) {
				return i;
			}
			else {
				continue;
			}
		}
		return great;
	}
}

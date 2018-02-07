
public class Main {

	public static void main(String[] args) {
		int[] values = {6, 5, 8, 7, 11};
		System.out.println("smallest: " + smallest(values));
		  
	}
	private static int smallest(int[] array) {
		int smallest = array[0];
		for (int i : array) {
			if (i <= smallest) {
				smallest = i;
			}
			else {
				continue;
			}
		}
		return smallest;
	}
}

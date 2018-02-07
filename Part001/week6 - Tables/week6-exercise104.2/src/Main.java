

public class Main {
	private static int count = -1;
	public static void main(String[] args) {
		// indexes:   0  1  2  3  4
		int[] values = {6, 5, 8, 7, 11};
		System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
		  
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
	public static int indexOfTheSmallest(int[] array) {
		int indexOfSmallest = -1;
	    for (int i : array) {
			count += 1;
			if (i == smallest(array)) {
				indexOfSmallest = count;
			}
			else {
				continue;
			}
		}
	    return indexOfSmallest;
	} 
}

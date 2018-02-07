

public class Main {
	public static void main(String[] args) {
		
		// indexes:    0  1  2  3   4
		int[] values = {-1, 6, 9, 8, 12};
		System.out.println(indexOfTheSmallestStartingFrom(values, 1));
		System.out.println(indexOfTheSmallestStartingFrom(values, 2));
		System.out.println(indexOfTheSmallestStartingFrom(values, 4));
		  
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
		int count = -1;
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
	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		int smallest = index;
		for (int i = index; i < array.length; i++) {
			if (array[i] < array[smallest]) {
				smallest = i;
				}
			else {
				continue;
			}
		}
		return smallest;
	}
	  
}

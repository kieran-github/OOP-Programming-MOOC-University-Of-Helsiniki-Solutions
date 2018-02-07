import java.nio.Buffer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] values = {8, 3, 7, 9, 1, 2, 4};
		sort(values);

		  
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
	
	public static void swap(int[] array, int index1, int index2) {
		int buffer1 = array[index1];
		int buffer2 = array[index2];
		array[index1] = buffer2;
		array[index2] = buffer1;
		} 
	
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int indexSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
}


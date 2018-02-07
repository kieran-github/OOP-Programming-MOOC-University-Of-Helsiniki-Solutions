
public class Main {
	public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
	}
	public static void printElegantly(int[] array) {
		for (int i : array) {
			if (i == array[array.length-1]) {
				System.out.print(+ i);
			}
			else {
			System.out.print(i + ", ");
			}
		}
	}
}

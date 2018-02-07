
public class PrintingARightAlignedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTriangle(4);

	}
	public static void printWhitespaces(int size) {
		for (int i = 0; i <= size; i++) {
			System.out.print(" ");
		}
	}
	public static void printStars(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void printTriangle(int size) {
		for (int i = 0; i <= size; i++) {
			printWhitespaces(size-i);
			printStars(i);
		}
	}
}

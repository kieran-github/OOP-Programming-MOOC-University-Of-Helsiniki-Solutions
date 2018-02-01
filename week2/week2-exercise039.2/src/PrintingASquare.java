
public class PrintingASquare {
	public static void main(String[] args) {
		printSquare(4);
	}
	public static void printStars(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void printSquare(int sideSize) {
		for (int i = 0; i < sideSize; i++) {
			printStars(sideSize);
		}
	}
}

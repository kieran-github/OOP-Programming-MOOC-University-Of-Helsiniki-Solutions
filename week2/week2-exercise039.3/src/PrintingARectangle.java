
public class PrintingARectangle {
	public static void main(String[] args) {
		printRectangle(17, 3);
	}
	public static void printRectangle(int width, int height) {
		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

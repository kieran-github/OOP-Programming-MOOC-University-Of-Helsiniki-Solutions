
public class PrintingStars {
	private static int counter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    printStars(5);
	    printStars(3);
	    printStars(9);
	

	}
	
	public static void printStars(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}


public class EvenNumbers {
	private static int counter = 1;
	
	public static void main(String[] args) {
		while (counter <= 100) {
			counter ++;
			if (counter % 2 == 0) {
				System.out.println(counter);
			}
			else {
				continue;
			}
		}
	}
}

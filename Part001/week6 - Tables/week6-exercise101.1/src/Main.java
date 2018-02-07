
public class Main {

	public static void main(String[] args) {
		Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
		System.out.println(cheese.getTitle());
		System.out.println(cheese.getPublisher());
		System.out.println(cheese.getYear());
		System.out.println(cheese);
	}
}

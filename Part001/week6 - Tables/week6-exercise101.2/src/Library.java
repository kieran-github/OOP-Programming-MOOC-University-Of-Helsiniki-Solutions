import java.util.ArrayList;

public class Library {
	private ArrayList<Book>listOfBooks;
	
	public Library() {
		listOfBooks = new ArrayList<Book>();
	}
	public void addBook(Book newBook) {
		listOfBooks.add(newBook);
	}
	public void printBooks() {
		for (Book book : listOfBooks) {
			System.out.println(book.toString());
		}
	}
}

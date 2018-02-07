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
	public ArrayList<Book>searchByTitle(String title){
		ArrayList<Book> found = new ArrayList<Book>();
		for (Book b : listOfBooks) {
			if (stringuti) {
				found.add(b);
			}
			else {
				continue;
			}
		}
		return found;
	}
	public ArrayList<Book>searchByPublisher(String publisher){
		ArrayList<Book> found = new ArrayList<Book>();
		for (Book b : listOfBooks) {
			if (b.toString().contains(publisher)) {
				found.add(b);
			}
			else {
				continue;
			}
		}
		return found;
	}
	public ArrayList<Book>searchByYear(int year){
		ArrayList<Book> found = new ArrayList<Book>();
		for (Book b : listOfBooks) {
			if (b.getYear() == year) {
				found.add(b);
			}
			else {
				continue;
			}
		}
		return found;
	}
}

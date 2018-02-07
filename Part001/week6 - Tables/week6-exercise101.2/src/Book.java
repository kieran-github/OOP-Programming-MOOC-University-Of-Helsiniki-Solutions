
public class Book {
	private String title;
	private String publisher;
	private int year;
	
	public Book(String inputTitle, String inputPublisher, int inputYear) {
		// TODO Auto-generated constructor stub
		this.title = inputTitle;
		this.publisher = inputPublisher;
		this.year = inputYear;
	}
	public String getTitle() {
		return this.title;
	}
	public String getPublisher() {
		return this.publisher;
	}
	public int getYear() {
		return this.year;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title + ", " + this.publisher + ", " + this.year;
	}
}

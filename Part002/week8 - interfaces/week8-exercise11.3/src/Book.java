
public class Book implements ToBeStored{
	private String writer;
	private String name;
	private double weight;
	
	public Book(String inputWriter, String inputName, double inputWeight) {
		this.writer = inputWriter;
		this.name = inputName;
		this.weight = inputWeight;
	}

	@Override
	public double weight() {
		// TODO Auto-generated method stub
		return this.weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.writer + ":" + this.name;
	}
}

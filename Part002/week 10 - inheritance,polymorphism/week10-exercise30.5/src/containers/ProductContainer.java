package containers;

public class ProductContainer extends Container{
	private String productName;
	public ProductContainer(String inputProductName, double capacity) {
		super(capacity);
		this.productName = inputProductName;
		
	}
	public String getName() {
		return this.productName;
	}
	public void setName(String inputNewName)
	{
		this.productName = inputNewName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.productName + ": " + super.toString();
	}
}

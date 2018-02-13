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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

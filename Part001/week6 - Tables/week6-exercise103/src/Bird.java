
public class Bird {
	private String name;
	private String latinName;
	private int obs = 0;
	
	public Bird(String inputName, String inputLatinName) {
		this.name = inputName;
		this.latinName = inputLatinName;
	}
	public int getObs() {
		return this.obs;
	}
	public void updateObs() {
		this.obs += 1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "(" + this.latinName + ")";
	}

}

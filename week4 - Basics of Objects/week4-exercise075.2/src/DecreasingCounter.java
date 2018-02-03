
public class DecreasingCounter {
	private int value;
	public DecreasingCounter(int valueAtStart) {
		this.value = valueAtStart;
	}
	public void printValue(){
		System.out.println("Value: " + this.value);
	}
	public void decrease() {
		if (this.value <= 0) {
			this.value = 0;
		}
		else {
			this.value -= 1;
		}
	}
}

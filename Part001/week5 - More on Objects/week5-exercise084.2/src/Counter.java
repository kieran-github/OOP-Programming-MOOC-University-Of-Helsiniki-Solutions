
public class Counter {
	private int value;
	private boolean negativeCheck;
	
	public Counter(int startingValue, boolean check) {
		this.value = startingValue;
		this.negativeCheck = check;
	}
	public Counter(int startingValue) {
		this.value = startingValue;
	}
	public Counter(boolean check) {
		this.negativeCheck = check;
	}
	public Counter() {
		this.value = 0;
	}
	public int value() {
		return this.value;
	}
	public void increase() {
		this.value += 1;
	}
	public void increase(int increaseAmount) {
		this.value += increaseAmount;
	}
	public void decrease() {
		if (this.negativeCheck) {
			if (this.value <= 0) {
				this.value -= 1;
			}
			else {
				System.out.println("Turn off the negative check if you wish to go below zero.");
			}
		}
		else {
			this.value += 1;
		}
	}
	public void decrease(int decreaseAmount) {
		if (this.negativeCheck) {
			if (this.value <= 0) {
				this.value -= decreaseAmount;
			}
			else {
				System.out.println("Turn off the negative check if you wish to go below zero.");
			}
		}else {
			this.value -= decreaseAmount;
		}
	}
}

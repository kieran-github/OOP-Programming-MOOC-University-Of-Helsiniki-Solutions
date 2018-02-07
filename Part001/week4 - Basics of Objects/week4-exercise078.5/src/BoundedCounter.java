public class BoundedCounter {
    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
    	if (this.value < this.upperLimit) {
    		this.value += 1;
		}
        else {
			this.value = 0;
		}
    }
    public int getValue() {
    	return this.value;
    }
    public void setValue(int inputNewValue) {
    	if (inputNewValue >= 0 && inputNewValue <= this.upperLimit) {
			this.value = inputNewValue;
		}else {
			System.err.println("The parameter given was below zero or more than the upper limit. ");
		}
    }
    public String toString() {
    	if (this.value < 10) {
    		return "Value: " + 0 + this.value;
		}
    	else {
    		return "Value: " + this.value;
    	}

    }
}
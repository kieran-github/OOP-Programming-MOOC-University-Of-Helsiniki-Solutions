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

    public String toString() {
        return "Value: " + this.value;
    }
}
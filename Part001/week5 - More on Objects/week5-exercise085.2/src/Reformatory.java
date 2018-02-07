public class Reformatory {
	private int weightBuffer;
	private int weightCount = 0;

    public int weight(Person person) {
       this.weightCount += 1;
       return person.getWeight();
    }
    public void feed(Person person) {
    	weightBuffer = person.getWeight();
    	person.setWeight(weightBuffer += 1);
    }
    public int totalWeightsMeasured() {
    	return this.weightCount;
    }
}
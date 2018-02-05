public class Reformatory {
	private int weightBuffer;

    public int weight(Person person) {
       // returns the weight of the parameter
       return person.getWeight();
    }
    public void feed(Person person) {
    	weightBuffer = person.getWeight();
    	person.setWeight(weightBuffer += 1);
    }
}
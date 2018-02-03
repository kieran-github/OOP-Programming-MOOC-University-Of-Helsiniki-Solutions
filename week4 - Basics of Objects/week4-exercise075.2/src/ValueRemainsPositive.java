
public class ValueRemainsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
	}

}

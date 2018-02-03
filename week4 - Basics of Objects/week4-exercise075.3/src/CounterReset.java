
public class CounterReset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrease();
        counter.printValue();
	}

}

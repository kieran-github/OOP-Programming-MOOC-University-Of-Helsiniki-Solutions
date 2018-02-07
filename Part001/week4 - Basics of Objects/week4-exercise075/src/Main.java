
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
	}

}

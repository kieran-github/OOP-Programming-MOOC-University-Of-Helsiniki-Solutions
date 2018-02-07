import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;
    private int randomInt;

    public Dice(int inputSides){
        this.numberOfSides = inputSides;
        random = new Random();

    }

    public int roll() {
    	return randomInt = random.nextInt(this.numberOfSides);
    }
}
   
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
    private int lotteryNumber;
    
    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
        	lotteryNumber = this.random.nextInt(39)+1;
        	if(this.containsNumber(lotteryNumber)){
                continue;
            }
        	else {
				numbers.add(lotteryNumber);
			}
		}
    }
    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)){
            return true;
        } else {
            return false;
        }
    }
}
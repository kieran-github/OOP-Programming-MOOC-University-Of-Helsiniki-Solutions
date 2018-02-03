import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	LotteryNumbers call = new LotteryNumbers();
        ArrayList<Integer> numbers = call.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
    
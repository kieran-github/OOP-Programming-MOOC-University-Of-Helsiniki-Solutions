import java.util.Arrays;
import java.util.Random;

public class Judge {
	Random random = new Random();
	public Judge() {
		// TODO Auto-generated constructor stub
	}
	
	public String getScores() {
		int[] scores = new int[4];
		for (int i = 0; i < scores.length; i++) {
			int score = random.nextInt(20 - 10) + 10;
			scores[i] = score;
		}
		return Arrays.toString(scores);
	}
}

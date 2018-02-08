import java.util.Random;

public class Skier {
	private Random r = new Random();
	private String name;
	private int score = 0;
	
	public Skier(String inputName) {
		// TODO Auto-generated constructor stub
		this.name = inputName;
	}
	public int jump() {
		int jump = r.nextInt((121)+61 );
		this.score += jump;
		return jump;
	}
	public int getScore() {
		return this.score;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + " (" + this.score +")";
	}


}

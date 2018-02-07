import java.util.Random;

public class NightSky {
	private double density;
	private int width;
	private int height;
	private int starCount = 0;
	public NightSky(double inputDensity) {
		this.density = inputDensity;
		this.width = 20;
		this.height = 10;
		
	}
	public NightSky(int inputWidth, int inputHeight) {
		this.density = 0.1;
		this.width = inputWidth;
		this.height = inputHeight;
		
	}
	public NightSky(double inputDensity, int inputWidth, int inputHeight) {
		this.density = inputDensity;
		this.width = inputWidth;
		this.height = inputHeight;
		
	}
	public void printLine() {
		Random random = new Random();
		for (int i = 0; i < this.width; i++) {
			if (random.nextDouble() <= this.density) {
				System.out.print("*");
				starCount += 1;
			}
			else {
				System.out.print(" ");
			}
		}
	}
	public void print() {
		for (int i = 0; i < this.height; i++) {
			this.printLine();
			System.out.println(" ");
		}
		System.out.println("");
	}
	public int starsInLastPrint() {
		return starCount;
	}
}

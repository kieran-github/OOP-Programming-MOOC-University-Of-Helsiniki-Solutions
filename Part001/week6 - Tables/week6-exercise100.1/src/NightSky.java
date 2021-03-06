import java.util.Random;

public class NightSky {
	private double density;
	private int width;
	private int height;
	
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
			}
			else {
				System.out.print(" ");
			}
		}
	}
}

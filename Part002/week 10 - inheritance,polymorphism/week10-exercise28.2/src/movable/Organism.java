package movable;

public class Organism implements Movable{
	private int x;
	private int y;
	public Organism(int inputX, int inputY) {
		this.x = inputX;
		this.y = inputY;
		
	}
	

	@Override
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x: " + this.x + " ; " + "y: " + this.y;
	}

}

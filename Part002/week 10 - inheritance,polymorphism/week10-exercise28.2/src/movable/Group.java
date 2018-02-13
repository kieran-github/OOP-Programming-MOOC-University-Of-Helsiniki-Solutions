package movable;


import java.util.ArrayList;

public class Group implements Movable{
	private ArrayList<Movable>myMovables = new ArrayList<Movable>();

	
	public void addToGroup(Movable inputMoveObject)
	{
		myMovables.add(inputMoveObject);
	}
	
	@Override
	public void move(int dx, int dy) {
		for (Movable movable : myMovables) {
			movable.move(dx, dy);
		}
		
	}
	@Override
	public String toString() {
		String buffer = "";
		for (Movable movable : myMovables) {
			buffer += movable.toString() + "\n";
		}
		return buffer;
	}

}

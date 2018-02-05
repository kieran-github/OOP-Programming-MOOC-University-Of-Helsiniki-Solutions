import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player>players = new ArrayList<Player>();
	private int maxSize;
	public Team(String inputName) {
		this.name = inputName;
	}
	public String getName() {
		return this.name;
	}
	public void addPlayer(Player newPlayer) {
		if (this.maxSize > this.players.size()) {
			players.add(newPlayer);
		}
		else 
		{
			System.out.println("The team is at the max size.");
		}
	}
	public void printPlayers() {
		for (Player player : players) {
			System.out.println(player);
		}
	}
	public void setMaxSize(int size) {
		this.maxSize = size;
	}
	public int size() {
        if(this.maxSize<this.players.size()) {
            return this.maxSize;
        }
        else {
            return this.players.size();
        }
    }
}

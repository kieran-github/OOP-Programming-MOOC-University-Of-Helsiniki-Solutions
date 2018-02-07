import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player>players = new ArrayList<Player>();
	public Team(String inputName) {
		this.name = inputName;
	}
	public String getName() {
		return this.name;
	}
	public void addPlayer(Player newPlayer) {
		players.add(newPlayer);
	}
	public void printPlayers() {
		for (Player player : players) {
			System.out.println(player);
		}
	}
}

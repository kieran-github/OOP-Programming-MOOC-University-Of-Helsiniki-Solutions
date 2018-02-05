import java.util.ArrayList;

import sun.reflect.generics.tree.ReturnType;

public class Team {
	private String name;
	private ArrayList<Player>players = new ArrayList<Player>();
	private int totalGoals = 0;
	private int maxSize = 10;
	public Team(String inputName) {
		this.name = inputName;
	}
	public String getName() {
		return this.name;
	}
	public void addPlayer(Player newPlayer) {
		if (this.maxSize >= this.players.size()) {
			players.add(newPlayer);
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
	public int getMaxSize() {
		return this.maxSize;
	}
	public int size() {
        if(this.maxSize<this.players.size()) {
            return this.maxSize;
        }
        else {
            return this.players.size();
        }
    }
	public int getTotalGoals() {
		for (Player player : players) {
			this.totalGoals += player.getGoals();
		}
		return this.totalGoals;

	}
}

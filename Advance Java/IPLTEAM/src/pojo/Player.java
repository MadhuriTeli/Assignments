package pojo;


import java.io.Serializable;

public class Player implements Serializable{

	private int id;
	private String playerName;
	private int ranking;
	private double points;
	
	static int count;
	
	static {
		count = 0;
	}
	
	public Player(String playerName, int ranking, double points) {
		count++;
		this.id = count;
		this.playerName = playerName;
		this.ranking = ranking;
		this.points = points;
	}

	public Player(int id, String playerName, int ranking, double points) {
		this.id = id;
		this.playerName = playerName;
		this.ranking = ranking;
		this.points = points;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", ranking=" + ranking + ", points=" + points + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Player other = (Player) obj;
		if (playerName.equals(other.playerName)) {
			if (Double.doubleToLongBits(points) == Double.doubleToLongBits(other.points))
				return true;
		}
		return false;
	}
	
}

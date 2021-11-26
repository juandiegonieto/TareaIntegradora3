package model;

public class Player {
	
	private int score;
	private String username;
	
	public Player(int score, String username) {
		this.score = score;
		this.username = username;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
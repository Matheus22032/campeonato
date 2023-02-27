package modelo;

import java.util.Random;

public class Time {
	private String name;
	private boolean win;
	private int score;

	public Time(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}

	public void setWin(boolean winner) {
		this.win = winner;
	}

	public boolean getWin() {
		return this.win;
	}

	public void scoreGeneretor() {
		Random random = new Random();
		this.score = random.nextInt(10);
	}
	
	public String getName() {
		return name;
	}
}

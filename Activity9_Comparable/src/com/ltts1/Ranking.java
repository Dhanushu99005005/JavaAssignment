package com.ltts1;

public class Ranking implements Comparable<Ranking>{
	private String name;
	private int score;
	
	public Ranking(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString()
	{
		return this.getName()+" "+this.getScore();
	}
	@Override
	public int compareTo(Ranking play)
	{
		return this.getScore() - play.getScore();
	}
	

}

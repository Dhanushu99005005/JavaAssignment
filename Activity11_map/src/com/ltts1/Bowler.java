package com.ltts1;

public class Bowler {
	private String wicketNames;
	public Bowler(String wicketNames) {
		this.wicketNames = wicketNames;
	}
	
	public String getWicketNames() {
		return wicketNames;
	}
	public void setWicketNames(String wicketNames) {
		this.wicketNames = wicketNames;
	}
	
	public void displayWickets()
	{
		String[] wickets = this.getWicketNames().split("\\|");
		System.out.println("Wickets");
		for(String wicket : wickets)
		{
			System.out.println(wicket);
		}
	}
}

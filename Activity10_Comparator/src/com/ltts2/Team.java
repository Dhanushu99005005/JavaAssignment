package com.ltts2;

import java.util.Comparator;

public class Team {
	private String name;
	private int numberOfMatches;
	public Team(String name, int numberOfMatches) {
		super();
		this.name = name;
		this.numberOfMatches = numberOfMatches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	
	public String toString()
	{
		return this.getName()+" - "+this.getNumberOfMatches();
	}
}

class TeamComparator implements Comparator<Team>
{
    public int compare(Team team1, Team team2)
    {
        return team1.getNumberOfMatches() - team2.getNumberOfMatches();
        
    }
}

package com.ltts1;
/**
 * @file Innings.java
 * @author DHANUSH U
 * @brief .
 * @version 0.1
 * @date 2021-08-14
 */

public class Innings {
	private String teamname;
	private String inningsname;
	private String First="First";
	private String Second="Second";
	private int runs;
	
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public void displayInningsDetails()
	{
		System.out.println("Name : "+teamname);
		System.out.println("Scored : "+runs);
		
		if(this.inningsname.equals(First))
		{
			System.out.println("Need "+(runs+1)+" to win");
		}
		else if(this.inningsname.equals(Second))
		{
			System.out.println("Match Ended");
		}
	}

}

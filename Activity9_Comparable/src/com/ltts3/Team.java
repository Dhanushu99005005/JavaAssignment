package com.ltts3;

public class Team implements Comparable<Team> {
	public String teamName;
	Player player;
	
	public Team(String teamName, Player player) {
		super();
		this.teamName = teamName;
		this.player = player;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public int compareTo(Team team) {
		int CompareTeam= this.getTeamName().compareTo(team.getTeamName());
		if(CompareTeam !=0)
		{
			return CompareTeam;
		}
		return this.getPlayer().getPlayerName().compareTo(team.getPlayer().getPlayerName());
	}
	
	
}

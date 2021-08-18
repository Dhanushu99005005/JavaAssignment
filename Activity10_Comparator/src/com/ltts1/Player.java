package com.ltts1;

import java.util.*;

public class Player{
	private String name;
	private String skill;
	
	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public String toString()
	{
		return "Player : "+this.getName()+" Skill : "+this.getSkill();
	}

}

class PlayerComparator implements Comparator<Player>
{
    public int compare(Player player1, Player player2)
    {
        int CompareSkill=player1.getSkill().compareTo(player2.getSkill());
        
        if(CompareSkill !=0)
        {
        	return CompareSkill;
        }
        return player1.getName().compareTo(player2.getName());
        
    }
}

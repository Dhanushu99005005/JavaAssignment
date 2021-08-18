package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        LinkedList <Player>linkedList = new LinkedList<Player>();
		
		System.out.println("Number of players to be registred: ");
		int NumPlay = Integer.parseInt(reader.readLine());
		for(int i=0;i<NumPlay;i++)
		{
			System.out.println("Enter PlayerName: ");
			String PlayerName = reader.readLine();
			
			System.out.println("Please select skill of player : ");
			System.out.println("1. All Rounder");
			System.out.println("2. Batsman ");
			System.out.println("3. Bowler ");
			int skill = Integer.parseInt(reader.readLine());
			String PlayerSkill;
			switch(skill)
			{
			case 1:PlayerSkill="All Rounder";
			       break;
			case 2:PlayerSkill="Batsman";
		           break;
			case 3:PlayerSkill="Bowler";
		           break;
			default :PlayerSkill="All Rounder";
			}
		    
			linkedList.add(new Player(PlayerName,PlayerSkill));	
		}
		Collections.sort(linkedList,new PlayerComparator());
		
		System.out.println("Player Details : ");
		for(Player player : linkedList)
		{
			System.out.println(player);
		}

	}

}

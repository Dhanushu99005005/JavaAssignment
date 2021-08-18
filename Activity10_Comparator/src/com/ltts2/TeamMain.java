package com.ltts2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class TeamMain {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        LinkedList <Team>linkedList = new LinkedList<Team>();
		
		System.out.println("Number of players to be registred: ");
		int NumPlay = Integer.parseInt(reader.readLine());
		for(int i=0;i<NumPlay;i++)
		{
			System.out.println("Enter team "+(i+1)+" details ");
			System.out.println("Enter Team name: ");
			String TeamName = reader.readLine();
			
			System.out.println("Enter number of matches played : ");
			int MatchesPlayed = Integer.parseInt(reader.readLine());
		    
			linkedList.add(new Team(TeamName,MatchesPlayed));	
		}
		Collections.sort(linkedList,new TeamComparator());
		
		System.out.println("Player Details : ");
		for(Team team : linkedList)
		{
			System.out.println(team);
		}

	}

}

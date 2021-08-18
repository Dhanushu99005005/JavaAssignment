package com.ltts3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class DisplayTeamMain {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Team> linkedList = new LinkedList<Team>();
		
		System.out.println("Enter number of matches : ");
		int NumPlay = Integer.parseInt(reader.readLine());
		for(int i=0;i<NumPlay;i++)
		{
			System.out.println("Enter Details in (Team|Player) format ");
			String Detail = reader.readLine();
			
			String[] details = Detail.split("\\|");
			
			linkedList.add(new Team(details[0],new Player(details[1])));
		}
		
		Collections.sort(linkedList);
		
		String CheckName="";
		
		for(Team teamName :linkedList)
		{
			if(teamName.getTeamName().compareTo(CheckName)!=0)
			{
				CheckName=teamName.getTeamName();
				System.out.println(CheckName);
				System.out.println("--"+teamName.getPlayer().getPlayerName());
				
			}
			else
			{
				System.out.println("--"+teamName.getPlayer().getPlayerName());
			}
		}
		

	}

}

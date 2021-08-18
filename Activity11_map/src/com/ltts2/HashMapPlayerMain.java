package com.ltts2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class HashMapPlayerMain {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		HashMap <String, Player> hashmapPlayer = new HashMap<String, Player>();
		
		final String confirmation = "yes";
		String checkConditionInput ="yes";
		String checkConditionOutput ="yes";
		
		while(checkConditionInput.toLowerCase().equals(confirmation))
		{
			
			System.out.println("Enter player name : ");
			String PlayerName = reader.readLine();
			
			System.out.println("Enter wickets seperated by | : ");
			String wicketsScored = reader.readLine();
			
			String[] wickets = wicketsScored.split("\\|");
			
			hashmapPlayer.put(PlayerName, new Player(PlayerName,wickets.length));
			
			System.out.println("Do you want to continue(yes/no) ");
			checkConditionInput=reader.readLine();
		}
		
		while(checkConditionOutput.toLowerCase().equals(confirmation))
		{
			System.out.println("Enter Player name to search : ");
			String PlayerSearch = reader.readLine();
			if(hashmapPlayer.containsKey(PlayerSearch))
			{
				System.out.println("Player name : "+PlayerSearch);
				System.out.println("Wicket Count : " +hashmapPlayer.get(PlayerSearch).getWicketCount());
			}
			else
			{
				System.out.println("No player is found with name : "+PlayerSearch);
			}
			System.out.println("Do you want to continue(yes/no) ");
			checkConditionOutput=reader.readLine();
		}

	}

}

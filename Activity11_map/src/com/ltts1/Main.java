package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		HashMap <String, Wicket> hashmapPlayer = new HashMap<String, Wicket>();
		
		final String confirmation = "yes";
		String checkConditionInput ="yes";
		String checkConditionOutput ="yes";
		
		while(checkConditionInput.toLowerCase().equals(confirmation))
		{
			
			System.out.println("Enter player name : ");
			String PlayerName = reader.readLine();
			
			System.out.println("Enter wickets seperated by | : ");
			String wicketsScored = reader.readLine();
			
			hashmapPlayer.put(PlayerName, new Wicket(PlayerName,new Bowler(wicketsScored)));
			
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
				hashmapPlayer.get(PlayerSearch).getBowler().displayWickets();
			}
			else
			{
				System.out.println("Invalid Name");
			}
			System.out.println("Do you want to continue(yes/no) ");
			checkConditionInput=reader.readLine();
		}
	}

}

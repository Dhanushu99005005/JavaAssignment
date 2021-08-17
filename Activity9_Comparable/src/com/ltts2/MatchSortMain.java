package com.ltts2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class MatchSortMain {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        LinkedList <Match>linkedList = new LinkedList<Match>();
		
		System.out.println("Enter number of matches : ");
		int NumPlay = Integer.parseInt(reader.readLine());
		for(int i=0;i<NumPlay;i++)
		{
			System.out.println("Enter match date in (MM-dd-yyyy): ");
			String DateOfMatch = reader.readLine();
			
			System.out.println("Enter team 1 : ");
			String teamOneName = reader.readLine();
					
			System.out.println("Enter team 2 : ");
			String teamTwoName = reader.readLine();
			
			linkedList.add(new Match(DateOfMatch,teamOneName,teamTwoName));
			
		}
		
		Collections.sort(linkedList,Collections.reverseOrder());
		
		System.out.println("Match Details :");
		for (Match match : linkedList)
		{
			System.out.println("Team 1 : "+match.getTeamOne());
			System.out.println("Team 2 : "+match.getTeamTwo());
			System.out.println("Match held on : "+match.getMatchDate());
		}

	}

}

package com.ltts3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		TreeMap <String, Player> treemapPlayer = new TreeMap<String, Player>();
		
		System.out.println("Enter number of players : ");
		int NumPlay = Integer.parseInt(reader.readLine());
		for(int i=0;i<NumPlay;i++)
		{
			System.out.println("Enter details of Player "+(i+1)+" : ");
			System.out.println("Enter Player Cap number : ");
			String PlayerCapNum = reader.readLine();
			
			System.out.println("Enter PlayerName : ");
			String PlayerName = reader.readLine();
					
			System.out.println("Enter team : ");
			String teamName = reader.readLine();
			
			System.out.println("Enter skill of player : ");
			String PlayerSkill = reader.readLine();
			
			treemapPlayer.put(PlayerCapNum, new Player(PlayerName,teamName,PlayerSkill));
			
		}
		
		 Set<Map.Entry<String, Player>> treemapPlayerSet = treemapPlayer.entrySet();
		 for(Map.Entry<String, Player> treemapPlayerStr:treemapPlayerSet)
		 {
		      System.out.print(treemapPlayerStr.getKey()+"--");
		      System.out.println(treemapPlayerStr.getValue());
		 }
			
		}

}

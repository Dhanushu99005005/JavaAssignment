package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Match {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		HashSet hashset = new HashSet();
		
		System.out.println("Enter number of Players : ");
		int NumPlayers = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter Player Names: ");
		for(int i=0;i<NumPlayers;i++)
		{
			hashset.add(reader.readLine());
		}
		
		System.out.println("Number of winners : "+hashset.size() );

	}

}

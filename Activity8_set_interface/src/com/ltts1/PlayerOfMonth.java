package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PlayerOfMonth {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		TreeSet<String> treeset = new TreeSet<String>();
		
		System.out.println("Enter number of Players : ");
		int NumPlayers = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter Player Names: ");
		for(int i=0;i<NumPlayers;i++)
		{
			treeset.add(reader.readLine());
		}
		
		for(String Player:treeset)
		{
			System.out.println(Player);
		}


	}

}

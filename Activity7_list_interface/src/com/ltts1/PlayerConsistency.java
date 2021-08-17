package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class PlayerConsistency {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		LinkedList linkedList12 = new LinkedList();
		LinkedList linkedList13 = new LinkedList();
		
		System.out.println("Enter number of players : ");
		int NumTeams = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter top "+NumTeams+" scorers of IPL Season 12: ");
		for(int i=0;i<NumTeams;i++)
		{
			linkedList12.add(reader.readLine());
		}
		System.out.println("Enter top "+NumTeams+" scorers of IPL Season 13: ");
		for(int i=0;i<NumTeams;i++)
		{
			linkedList13.add(reader.readLine());
		}
		for(int i=0;i<NumTeams;i++)
		{
			if(linkedList12.contains(linkedList13.get(i)))
			{
				System.out.println(linkedList13.get(i));
			}
		}

	}

}

package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TeamSwap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		LinkedList linkedList = new LinkedList();
		
		System.out.println("Enter number of teams : ");
		int NumTeams = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter team names: ");
		for(int i=0;i<NumTeams;i++)
		{
			linkedList.add(reader.readLine());
		}
		
		System.out.println("Team list before swap : ");
		
		Iterator iterBefore = linkedList.iterator();
		while(iterBefore.hasNext()) {
			System.out.println(iterBefore.next());
		}
		
		System.out.println("Enter Swap Position : ");
		int SwapPos = Integer.parseInt(reader.readLine());
		
		 Collections.swap(linkedList, SwapPos, 0);
		 
		 System.out.println("Team list before swap : ");
			
		Iterator iterAfter = linkedList.iterator();
		while(iterAfter.hasNext()) {
			System.out.println(iterAfter.next());
		}

	}

}

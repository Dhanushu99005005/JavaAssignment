package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class RankingMain {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		LinkedList <Ranking>linkedList = new LinkedList<Ranking>();
		
		System.out.println("Enter number of Players : ");
		int NumPlay = Integer.parseInt(reader.readLine());
		for(int i=0;i<NumPlay;i++)
		{
			System.out.println("Enter name of Player "+(i+1)+": ");
			String PlayerName = reader.readLine();
			
			System.out.println("Enter score scored by Player "+(i+1)+" :");
			int PlayerScore = Integer.parseInt(reader.readLine());
			
			linkedList.add(new Ranking(PlayerName,PlayerScore));
		}
		
		Collections.sort(linkedList,Collections.reverseOrder());
		
		System.out.println("Player Details by Score");
        for (int i=0; i<linkedList.size(); i++)
        {
            System.out.println((i+1)+" "+linkedList.get(i));  
        }
		

	}

}

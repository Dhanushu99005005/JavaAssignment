package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class CountIn2020 {

	public static void main(String[] args) throws IOException{
		int count50=0,count100=0;
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		LinkedList <Integer>linkedList = new LinkedList<Integer>();
		
		System.out.println("Enter number of teams : ");
		int NumPlay = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter Scores: ");
		for(int i=0;i<NumPlay;i++)
		{
			linkedList.add(Integer.parseInt(reader.readLine()));
		}
		
		for(int i=0;i<NumPlay;i++)
		{
			if(linkedList.get(i)>=50 && linkedList.get(i)<100 )
			{
				count50++;
			}
			else if(linkedList.get(i)>=100)
			{
				count100++;
			}
		}
		System.out.println("Half Centuries : "+count50);
		System.out.println("Centuries : "+count100);
	}

}

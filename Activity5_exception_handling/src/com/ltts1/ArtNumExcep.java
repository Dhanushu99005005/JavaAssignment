package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArtNumExcep {

	public static void main(String[] args) throws IOException{
		
		int RunsScored,OversFaced;
		float RunRate;
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the total runs scored : ");
			RunsScored = Integer.parseInt(reader.readLine());
			System.out.println("Enter the total overs faced : ");
			OversFaced = Integer.parseInt(reader.readLine());
			
			RunRate=RunsScored/OversFaced;
			System.out.println("Current Run Rate : "+RunRate);
		}
		catch( ArithmeticException | NumberFormatException e)
		{
			System.out.println(e.getClass().getName());
		}	

	}

}

package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegOutBound {

	public static void main(String[] args) throws IOException{
		int OversFaced,OverNum;
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the total overs faced : ");
			OversFaced = Integer.parseInt(reader.readLine());
			
			int[] RunsScored = new int[OversFaced];
			
			System.out.println("Enter number of runs per each over : ");
			for(int i=0;i<RunsScored.length;i++ )
			{
				RunsScored[i]=Integer.parseInt(reader.readLine());
			}
			
			System.out.println("Enter over number : ");
			OverNum = Integer.parseInt(reader.readLine());
			
			System.out.println("Current Run Rate : "+RunsScored[OverNum-1]);
			
			
		}
		catch( ArithmeticException | ArrayIndexOutOfBoundsException | NegativeArraySizeException e)
		{
			System.out.println(e.getClass().getName());
		}

	}

}

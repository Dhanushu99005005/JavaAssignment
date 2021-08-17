package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CustomException extends Exception
{
  CustomException(){
  }
  public String toString()
  {
    return "CustomException:InvalidAgeRangeException";
  }
}

public class CustomExcep {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter player name : ");
			String PlayerName = reader.readLine();
			System.out.println("Enter player age : ");
			int PlayerAge = Integer.parseInt(reader.readLine());
			if(PlayerAge<19)
			{
				throw new CustomException();
			}
			else
			{
				System.out.println("Player Name :"+PlayerName);
				System.out.println("Player Age :"+PlayerAge);
			}
		}
		catch(ArithmeticException | NumberFormatException | CustomException e)
		{
			System.out.println(e);
		}	

	}

}

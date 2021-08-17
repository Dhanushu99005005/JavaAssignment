package com.ltts1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TeamException extends Exception
{
  TeamException(){
  }
  public String toString()
  {
    return "TeamNameNotFoundException:Entered team is not a part of IPL Season 13";
  }
}

public class NameExecp {

	public static void main(String[] args) throws IOException{
		boolean WinnerCheck=false;
		boolean RunnerUpCheck=false;
		String[] IPLTeams= {"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals","Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the expected winner team of IPL: ");
			String WinnerTeam = reader.readLine();
			System.out.println("Enter the expected winner team of IPL: ");
			String RunnerUpTeam = reader.readLine();
			
			for(String CheckWinnerTeam : IPLTeams)
			{
				if(WinnerTeam.toLowerCase().equals(CheckWinnerTeam.toLowerCase())) {
					WinnerCheck=true;
					break;
				}
			}
			for(String CheckRunnerUpTeam : IPLTeams)
			{
				if(RunnerUpTeam.toLowerCase().equals(CheckRunnerUpTeam.toLowerCase())) {
					RunnerUpCheck=true;
					break;
				}
			}
			if(WinnerCheck && RunnerUpCheck)
			{
				System.out.println("Expected IPL Season 13 winner :"+WinnerTeam);
				System.out.println("Expected IPL Season 13 winner :"+RunnerUpTeam);
			}
			else
			{
				throw new TeamException();
			}
		}
		catch(TeamException e)
		{
			System.out.println(e);
		}

	}

}

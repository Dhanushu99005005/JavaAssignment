package com.ltts1;
/**
 * @file Innings.java
 * @author DHANUSH U
 * @brief .
 * @version 0.1
 * @date 2021-08-14
 */

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Innings team = new Innings();
		
		final String confirmation = "yes";
		String checkCondition ="yes";
		
		while(checkCondition.toLowerCase().equals(confirmation))
		{
		System.out.println("Enter the team name : ");
		String TeamName= scan.nextLine();
		team.setTeamname(TeamName);
		
		System.out.println("Enter session : ");
		String Session= scan.nextLine();
		team.setInningsname(Session);
		
		System.out.println("Enter runs : ");
		int Score= scan.nextInt();
		team.setRuns(Score);
		scan.nextLine();
		team.displayInningsDetails();
		
		System.out.println("Do you want to continue(yes/no) ");
		checkCondition=scan.nextLine();
		}
		scan.close();

	}

}

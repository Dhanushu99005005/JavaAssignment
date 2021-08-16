package com.ltts2;

import java.util.Scanner;

public class MatchMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the match format : ");
		System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("2. Test");
		int option = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter Current Score : ");
		int MatchScore = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter Current Over : ");
		int MatchOver = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter Target Score : ");
		int MatchTarget = scan.nextInt();
		scan.nextLine();
		
		switch(option)
		{
		case 1 : ODIMatch odimatch = new ODIMatch();
		         odimatch.setCurrentscore(MatchScore);
		         odimatch.setCurrentover(MatchOver);
		         odimatch.setTarget(MatchTarget);
		         int remainingODIBalls=odimatch.calculateBalls();
		         double reqODIRunRate=odimatch.calculateRunRate();
		         odimatch.display(reqODIRunRate, remainingODIBalls);
		         break;
		case 2 : T20Match t20match = new T20Match();
		         t20match.setCurrentscore(MatchScore);
		         t20match.setCurrentover(MatchOver);
		         t20match.setTarget(MatchTarget);
                 int remainingt20Balls=t20match.calculateBalls();
                 double reqt20RunRate=t20match.calculateRunRate();
                 t20match.display(reqt20RunRate, remainingt20Balls);
                 break;
		case 3 : TestMatch testmatch = new TestMatch();
		         testmatch.setCurrentscore(MatchScore);
		         testmatch.setCurrentover(MatchOver);
		         testmatch.setTarget(MatchTarget);
                 int remainingtestBalls=testmatch.calculateBalls();
                 double reqtestRunRate=testmatch.calculateRunRate();
                 testmatch.display(reqtestRunRate, remainingtestBalls);
                 break;
        default :System.out.println("Invalid Option");
		}
		scan.close();
	}

}

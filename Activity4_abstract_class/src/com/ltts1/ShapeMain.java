package com.ltts1;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final String confirmation = "yes";
		String checkCondition ="yes";
		
		while(checkCondition.toLowerCase().equals(confirmation))
		{
		System.out.println("Enter Shape");
		System.out.println("1. Circle");
		System.out.println("2. Square");
		int option = scan.nextInt();
		scan.nextLine();
		
		if(option==1)
		{
			System.out.println("Enter Radius");
			int radius = scan.nextInt();
			scan.nextLine();
			Circle circle = new Circle();
			circle.calculateArea(radius);
		}
		else if(option==2)
		{
			System.out.println("Enter Side");
			int side = scan.nextInt();
			scan.nextLine();
			Square square = new Square();
			square.calculateArea(side);
		}
		System.out.println("Do you want to continue(yes/no) ");
		checkCondition=scan.nextLine();
		}
		scan.close();

	}

}

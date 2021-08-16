package com.ltts1;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Vehicle Type");
		System.out.println("1. Four Wheeler");
		System.out.println("2. Two Wheeler");
		int option = scan.nextInt();
		scan.nextLine();
		if(option==1)
		{
			System.out.println("Enter Vehicle Make : ");
			String VehicleMake= scan.nextLine();
			
			System.out.println("Enter Vehicle Number : ");
			String VehicleNumber= scan.nextLine();
			
			System.out.println("Enter Vehicle Fuel Type : ");
			System.out.println("1. Petrol ");
			System.out.println("2. Diesel ");  
			int VehicleFuelType= scan.nextInt();
			scan.nextLine();
			
			String VehicleFuel;
			if(VehicleFuelType==1)
			{
				VehicleFuel="Petrol";
			}
			else if(VehicleFuelType==2)
			{
				VehicleFuel="Diesel";
			}
			else
			{
				VehicleFuel="Petrol";
				System.out.println("Invalid Input");
				System.out.println("Taking Petrol as Default");
			}
			
			System.out.println("Enter Vehicle Fuel Capacity : ");
			int VehicleFuelCapacity= scan.nextInt();
			scan.nextLine();
			
			System.out.println("Enter Engine CC : ");
			int VehicleCC= scan.nextInt();
			scan.nextLine();
			
			System.out.println("Enter Vehicle Audio System : ");
			String VehicleAudioSystem= scan.nextLine();
			
			System.out.println("Enter Number of Doors : ");
			int VehicleNumDoors= scan.nextInt();
			scan.nextLine();
			
			FourWheeler modelType4 = new FourWheeler(VehicleMake,VehicleNumber,VehicleFuel,VehicleFuelCapacity,VehicleCC,VehicleAudioSystem,VehicleNumDoors);
			
			modelType4.displayMake();
			modelType4.displayBasicInfo();
			modelType4.displayDetailInfo();
		}
		if(option==2)
		{
			final String Confirmation="yes";
			System.out.println("Enter Vehicle Make : ");
			String VehicleMake= scan.nextLine();
			
			System.out.println("Enter Vehicle Number : ");
			String VehicleNumber= scan.nextLine();
			
			System.out.println("Enter Vehicle Fuel Type : ");
			System.out.println("1. Petrol ");
			System.out.println("2. Diesel ");  
			int VehicleFuelType= scan.nextInt();
			scan.nextLine();
			
			String VehicleFuel;
			if(VehicleFuelType==1)
			{
				VehicleFuel="Petrol";
			}
			else if(VehicleFuelType==2)
			{
				VehicleFuel="Diesel";
			}
			else
			{
				VehicleFuel="Petrol";
				System.out.println("Invalid Input");
				System.out.println("Taking Petrol as Default");
			}
			
			System.out.println("Enter Vehicle Fuel Capacity : ");
			int VehicleFuelCapacity= scan.nextInt();
			scan.nextLine();
			
			System.out.println("Enter Engine CC : ");
			int VehicleCC= scan.nextInt();
			scan.nextLine();
			
			System.out.println("Is Kick Start Available(yes/no) : ");
			String VehicleKickStart= scan.nextLine();
			boolean VehicleKickStartAvailable; 
			if(VehicleKickStart.toLowerCase().equals(Confirmation))
			{
				VehicleKickStartAvailable=true;
			}
			else
			{
				VehicleKickStartAvailable=false;
			}
			
			TwoWheeler modelType2 = new TwoWheeler(VehicleMake,VehicleNumber,VehicleFuel,VehicleFuelCapacity,VehicleCC,VehicleKickStartAvailable);
			
			modelType2.displayMake();
			modelType2.displayBasicInfo();
			modelType2.displayDetailInfo();
		}
		scan.close();
	}
	

}

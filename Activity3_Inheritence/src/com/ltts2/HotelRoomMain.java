package com.ltts2;

import java.util.Scanner;

public class HotelRoomMain {

	public static void main(String[] args) {
		final String Confirmation="yes";
		Scanner scan = new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("2. Suite AC Room");
		System.out.println("Select Room Type");
		int option = scan.nextInt();
		scan.nextLine();
		
	    System.out.println("Enter Hotel Name ");
		String RoomName= scan.nextLine();
		
		System.out.println("Enter Room Square Feet Area ");
		int roomSqFt= scan.nextInt();
		scan.nextLine();
		         
		System.out.println("Does Room has TV(yes/no) : ");
		String roomTV= scan.nextLine();
		boolean checkTV; 
		if(roomTV.toLowerCase().equals(Confirmation))
		{
		   checkTV=true;
		}
		else
		{
		   checkTV=false;
		}
		
		System.out.println("Does Room has Wifi(yes/no) : ");
		String roomWifi= scan.nextLine();
		boolean checkWifi; 
		if(roomWifi.toLowerCase().equals(Confirmation))
		{
		    checkWifi=true;
		}
		else
		{
		    checkWifi=false;
		}
		
		switch(option)
		{
		case 1:DeluxeRoom deluxeroom = new DeluxeRoom(RoomName,roomSqFt,checkTV,checkWifi);
               int deluxeTariff=deluxeroom.calculateTariff();
               System.out.println("RoomTariff per day is :"+deluxeTariff);
               break;
		case 2:DeluxeACRoom deluxeacroom = new DeluxeACRoom(RoomName,roomSqFt,checkTV,checkWifi);
		       int deluxeACTariff=deluxeacroom.calculateTariff();
               System.out.println("RoomTariff per day is :"+deluxeACTariff);
               break;
		case 3:SuiteACRoom suiteacroom = new SuiteACRoom(RoomName,roomSqFt,checkTV,checkWifi);
		       int suiteACTariff=suiteacroom.calculateTariff();
               System.out.println("RoomTariff per day is :"+suiteACTariff);
               break;
        default:System.out.println("Invalid Option");
		}
		scan.close();
	}

}

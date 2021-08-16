package com.ltts2;
/**
 * @file CustomerMain.java
 * @author DHANUSH U
 * @brief .
 * @version 0.1
 * @date 2021-08-14
 */

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Customer person = new Customer();
		
		final String confirmation = "yes";
		String checkCondition ="yes";
		
		while(checkCondition.toLowerCase().equals(confirmation))
		{
		System.out.println("Enter details : ");
		String CustomerDetails= scan.nextLine();
		
		String[] details=CustomerDetails.split(",");
		String CustomerName = details[0];
		String CustomerAddress = details[1];
		String CustomerMobile = details[2];
		
		person.setName(CustomerName);
		person.setAddress(CustomerAddress);
		person.setMobile(CustomerMobile);
		
		System.out.println("Customer Details");
		System.out.println("Name    "+person.getName());
		System.out.println("Address "+person.getAddress());
		System.out.println("Mobile  "+person.getMobile());
		
		System.out.println("Do you want to continue(yes/no) ");
		checkCondition=scan.nextLine();
		}
		scan.close();

	}

}

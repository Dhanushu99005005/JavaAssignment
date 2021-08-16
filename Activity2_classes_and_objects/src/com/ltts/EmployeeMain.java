package com.ltts;
/**
 * @file EmployeeMain.java
 * @author DHANUSH U
 * @brief .
 * @version 0.1
 * @date 2021-08-14
 */

import java.util.Scanner;

public class EmployeeMain {
    
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Employee person = new Employee();
		
		final String confirmation = "yes";
		String checkCondition ="yes";
		
		while(checkCondition.toLowerCase().equals(confirmation))
		{
		System.out.println("Enter Name : ");
		String EmployeeName= scan.nextLine();
		person.setName(EmployeeName);
		
		System.out.println("Enter Address : ");
		String EmployeeAddress= scan.nextLine();
		person.setAddress(EmployeeAddress);
		
		System.out.println("Enter Mobile Number : ");
		String EmployeeMobile= scan.nextLine();
		person.setMobile(EmployeeMobile);
		
		System.out.println("Employee Details");
		System.out.println("Name    "+person.getName());
		System.out.println("Address "+person.getAddress());
		System.out.println("Mobile  "+person.getMobile());
		
		System.out.println("Do you want to continue(yes/no) ");
		checkCondition=scan.nextLine();
		}
		scan.close();
	}

}

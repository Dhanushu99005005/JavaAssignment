package com.ltts3;
/**
 * @file CompanyMain.java
 * @author DHANUSH U
 * @brief .
 * @version 0.1
 * @date 2021-08-14
 */

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		boolean check = false;
		Scanner scan = new Scanner(System.in);
		Company team = new Company();
		
		System.out.println("Enter Company name : ");
		String CompanyName= scan.nextLine();
		team.setName(CompanyName);
		
		System.out.println("Enter Employees names : ");
		String EmployeeDetails= scan.nextLine();
		team.setEmployees(EmployeeDetails);
		
		String[] details = EmployeeDetails.split(",");
		
		System.out.println("Enter TeamLead : ");
		String LeadName= scan.nextLine();
		team.setTeamlead(LeadName);
		
		scan.close();
		
		for(String CheckLead : details)
		{
			if(team.getTeamlead().equals(CheckLead))
			{
				check=true;
				break;
			}
		}
		if(check)
		{
			System.out.println("Name      "+team.getName());
			System.out.println("Employees "+team.getEmployees());
			System.out.println("Lead      "+team.getTeamlead());
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}

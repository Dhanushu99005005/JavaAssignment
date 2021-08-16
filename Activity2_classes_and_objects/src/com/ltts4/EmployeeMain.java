package com.ltts4;
/**
 * @file EmployeeMain.java
 * @author DHANUSH U
 * @brief .
 * @version 0.1
 * @date 2021-08-14
 */
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee person = new Employee();
		
		System.out.println("Enter Name : ");
		String EmployeeName= scan.nextLine();
		person.setName(EmployeeName);
		
		System.out.println("Enter Address : ");
		String EmployeeAddress= scan.nextLine();
		person.setAddress(EmployeeAddress);
		
		System.out.println("Enter Mobile Number : ");
		String EmployeeMobile= scan.nextLine();
		person.setMobile(EmployeeMobile);
		
		person.displayEmployeeDetails();
		
		System.out.println("Verify and Update details : ");
		
		while(true)
		{
			System.out.println("Menu: ");
			System.out.println("1. Update Employee Name");
			System.out.println("2. Update Employee Address");
			System.out.println("3. Update Employee mobile");
			System.out.println("4. Display Info");
			System.out.println();
			System.out.println("Enter your option");
			int option = scan.nextInt();
			scan.nextLine();
			
			switch(option)
			{
			case 1 :System.out.println("Current name is"+person.getName());
			        System.out.println("Enter new Name : ");
			        String UpdatedName= scan.nextLine();
			        person.setName(UpdatedName);
			        break;
			case 2 :System.out.println("Current Address is"+person.getAddress());
			        System.out.println("Enter new Address : ");
		            String UpdatedAddress= scan.nextLine();
		            person.setAddress(UpdatedAddress);
		            break;
			case 3 :System.out.println("Current Mobile Number is"+person.getMobile());
			        System.out.println("Enter new Mobile Number : ");
	                String UpdatedMobile= scan.nextLine();
	                person.setMobile(UpdatedMobile);
	                break;
			case 4 :person.displayEmployeeDetails();
			        scan.close();
			        System.exit(0);
			        break;
			default:System.out.println("Invalid option");
			        scan.close();
			        System.exit(0);          
			}
		}
		
	}

}

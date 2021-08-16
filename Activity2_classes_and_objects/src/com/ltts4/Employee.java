package com.ltts4;
/**
 * @file Employee.java
 * @author DHANUSH U
 * @brief .
 * @version 0.1
 * @date 2021-08-14
 */

public class Employee {
	private String name;
	private String Address;
	private String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("Name    "+this.getName());
		System.out.println("Address "+this.getAddress());
		System.out.println("Mobile  "+this.getMobile());
	}


}

package com.ltts1;

/**
 * @file Vehicle.java
 * @author DHANUSH U
 * @brief .
 * @version 0.1
 * @date 2021-08-14
 */

public class Vehicle {
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) 
	{
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void displayMake()
	{
		System.out.println("***"+this.getMake()+"***");
	}
	
	public void displayBasicInfo()
	{
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number : "+this.getVehicleNumber());
		System.out.println("Fuel Capacity : "+this.getFuelCapacity());
		System.out.println("Fuel Type : "+this.getFuelType());
		System.out.println("CC : "+this.getCc());
	}
	
	//public void displayDetailInfo() {}
	
}

class TwoWheeler extends Vehicle{
	private boolean kickStartAvailable;
	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,boolean kickStartAvailable)
	{
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		this.kickStartAvailable=kickStartAvailable;
	}
	
	public boolean getkickStartAvailable() {
		return kickStartAvailable;
	}

	public void setFuelCapacity(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	
	public void displayDetailInfo() {
		System.out.println("---Detailed Information---");
		if(this.getkickStartAvailable())
		{
			System.out.println("Kick Start Available : YES");
		}
		else
		{
			System.out.println("Kick Start Available : NO");
		}
	}
	
}

class FourWheeler extends Vehicle{
	private String audioSystem;
	private int numbeOfDoors;
	
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,String audioSystem,int numbeOfDoors)
	{
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		this.audioSystem=audioSystem;
		this.numbeOfDoors=numbeOfDoors;
	}
	
	public String getaudioSystem() {
		return audioSystem;
	}

	public void setaudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	
	public int getnumbeOfDoors() {
		return numbeOfDoors;
	}

	public void setFuelCapacity(int numbeOfDoors) {
		this.numbeOfDoors = numbeOfDoors;
	}
	
	public void displayDetailInfo() {
		System.out.println("---Detailed Information---");
		System.out.println("Audio System : "+this.getaudioSystem());
		System.out.println("Number of Doors : "+this.getnumbeOfDoors());
	}
		
	
}

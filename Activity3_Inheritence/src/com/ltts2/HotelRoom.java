package com.ltts2;

public class HotelRoom {
	
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public boolean isHasTV() {
		return hasTV;
	}

	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
}

class DeluxeRoom extends HotelRoom
{
	protected int ratePerSqFeet;
	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet=10;
	}
	
	public int getRatePerSqFeet() {
		if(isHasWifi()) {
			return (this.ratePerSqFeet+2); 
		}
		else
		{
			return this.ratePerSqFeet;
		}
	}
	
	public int calculateTariff()
	{
		return this.numberOfSqFeet * this.getRatePerSqFeet();
	}
}

class DeluxeACRoom extends DeluxeRoom{
    private int ratePerSqFeet;
	
	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet=12;
	}
	public int calculateTariff()
	{
		return this.numberOfSqFeet * this.ratePerSqFeet;
	}
}

class SuiteACRoom extends HotelRoom{
	 private int ratePerSqFeet;
		
	 public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet=15;
	}
	 public int getRatePerSqFeet() {
		if(isHasWifi()) {
			return (this.ratePerSqFeet+2); 
		}
		else
		{
			return this.ratePerSqFeet;
		}
	}
	 
	 public int calculateTariff()
		{
			return this.numberOfSqFeet * this.getRatePerSqFeet();
		}
}

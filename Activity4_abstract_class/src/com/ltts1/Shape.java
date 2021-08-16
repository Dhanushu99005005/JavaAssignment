package com.ltts1;

public abstract class Shape {
	protected int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public abstract void calculateArea(int value);

}

class Circle extends Shape{
	
	public void calculateArea(int value)
	{
		System.out.println("Area of Circle is : "+Math.PI*value*value); 
	}
}

class Square extends Shape{
	
	public void calculateArea(int value)
	{
		System.out.println("Area of Square is : "+value*value); 
	}
}

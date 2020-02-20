package Bike_Example;

public class Mountain_Bike extends Bike

{

	public int Height;
	public String Color;
	
	
	
	
	public Mountain_Bike()
	
	{
		super();
	}




	public Mountain_Bike(int height, String color,int gear,double speed) 
	
	{
		super();
		Height = height;
		Color = color;
		Gear = gear;
		Speed = speed;
	}
	
     public void show2 ()
	
	{
		show1();
		
		System.out.println(" ");
		 
		System.out.println("  Height  : " + Height);
		System.out.println(" Color : " + Color);
		
		System.out.println(" I am in Mountain Bike Class");
		
	}
	
	
	
	
	
}

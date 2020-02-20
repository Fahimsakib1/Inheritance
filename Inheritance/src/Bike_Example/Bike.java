package Bike_Example;

public class Bike 

{
    public int Gear;
	public double Speed;
	
	
	/**public int getGear() 
	
	{
		return Gear;
	}
	
	public void setGear(int gear) 
	
	{
		Gear = gear;
	}
	
	public double getSpeed() 
	
	{
		return Speed;
	}
	
	public void setSpeed(double speed) 
	
	{
		Speed = speed;
	}**/
	
	

	public Bike() 
	
	{
	
	}

	public Bike(int gear, double speed) 
	
	{
		
		Gear = gear;
		Speed = speed;
		
		
	}
	
	public void show1 ()
	
	{
		
		System.out.println(" Input Gear Is : " + Gear);
		System.out.println(" Input Speed Is : " + Speed);
		
		System.out.println(" I am in Bike Class ");
		
		
		
	}
	
	
	
	
	
	
	
}

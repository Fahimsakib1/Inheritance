package Inheritance_Private_Members;

public class Student_Private 

{
   
	

    private String Name;
    private String ID;
    private int Age;
    private String Dept;
    
    
    
    public String getName() 
    {
		return Name;
	}

    public void setName(String name) 
    {
		Name = name;
	}

    public String getID() 
	{
		return ID;
	}

    public void setID(String iD) 
	{
		ID = iD;
	}

    public int getAge() 
	{
		return Age;
	}


    public void setAge(int age) 
	{
		Age = age;
	}


    public String getDept() 
	{
		return Dept;
	}


    public void setDept(String dept) 
	{
		Dept = dept;
	}
    
}

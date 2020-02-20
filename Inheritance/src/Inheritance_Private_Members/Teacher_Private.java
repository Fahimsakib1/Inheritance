package Inheritance_Private_Members;

public class Teacher_Private extends Student_Private
{
	private String Qualification;
	private String Contact;
	
	
	public String getQualification() 
	{
		return Qualification;
	}
	
	public void setQualification(String qualification) 
	{
		Qualification = qualification;
	}
	
	public String getContact() 
	{
		return Contact;
	}
	
	public void setContact(String contact) 
	{
		Contact = contact;
	}
	
	public void Show()
	{
		
		System.out.println(" Name is : " +getName());
		System.out.println(" ID Is : " +getID());
		System.out.println(" Age is : " +getAge());
		System.out.println(" Department is : " +getDept());
		System.out.println(" Phone Number : " +getContact());
		System.out.println(" Qualification : " +getQualification());
		
	}
	
	
	
	
}



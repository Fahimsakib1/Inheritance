
public class Teacher extends Student //Syntax of Inheritance
{
   
	public String Qualification;
	public String Contact;
	
	public void Show2()
	{
		Show1();   //because of inheritance teacher class will get access to show1() method of student class
		System.out.println(" Qualification  is: " + Qualification);;
		System.out.println(" Phone Number Is : " + Contact);
		
	}
	
}

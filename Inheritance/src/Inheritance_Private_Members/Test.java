package Inheritance_Private_Members;

public class Test 

{

	public static void main(String[] args) 
	
	{
		Teacher_Private T1= new Teacher_Private();
		
		T1.setName(" Fahim ");
		T1.setAge(25);
		T1.setID(" 17-35163-2");
		T1.setDept(" CSE");
		T1.setContact(" 018-7020-3220");
		T1.setQualification(" BSc in CSE");
		
		/**System.out.println(" Name is : " +T1.getName());
		System.out.println(" ID Is : " +T1.getID());
		System.out.println(" Age is : " +T1.getAge());
		System.out.println(" Department is : " +T1.getDept());
		System.out.println(" Phone Number : " +T1.getContact());
		System.out.println(" Qualification : " +T1.getQualification());**/
		
		T1.Show();
		
		
		

	}

}

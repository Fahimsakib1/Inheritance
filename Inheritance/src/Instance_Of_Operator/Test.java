package Instance_Of_Operator;

public class Test {

	public static void main(String[] args) 
	
	{
		Animal A =new Animal();
		Person P =new Person();
		Teacher T = new Teacher ();
		
		System.out.println( A instanceof Animal);      // Animal Class er object A, So True Hobe Output.
		System.out.println( P instanceof Animal);     // Person Class Animal Class k Inherit Kore tai True.
		System.out.println( T instanceof Person);     // Teacher class Person class K Inherit kore taai true.
		System.out.println( T instanceof Animal);     // Teacher class Animal class K Inherit kore taai true.
		System.out.println( P instanceof Teacher );   // Person class Teacher Class K Inherit kore na  taai False.
		System.out.println( A instanceof Teacher);    // Animal class Teacher Class K Inherit kore na  taai False.
		System.out.println( A instanceof Person);     // Animal class Person Class K Inherit kore na  taai False.
		

	}

}

package basicprograms.classes;
 
public class FirstClass {

	public static void main(String[] args)
	{  
		
		
		call s1 = new call();
		 s1.roll =1;
		 s1.section='a';
		// s1.display();
		  
		 System.out.println("\n roll is :" +s1.roll +"\nsection is :"+ s1.section +"\ncolleage is :"+s1.collage);
		 call s2 = new call();
		 s2.roll =2;
		 s2.section='b';
		 System.out.println("\n roll is :" +s2.roll +"\nsection is :"+ s2.section +"\ncolleage is :"+s2.collage);

	}

}

class call
{
	 String collage ="parul university";
	 int roll;
	 char section;
	 String name ; 
	 }
  

public class Ncr {

	public static void main(String arg[]) {
		 //factorail
		{
			 int n=5,fact=1,r=3,f=n-r;
			 while(n>=1)
			  {
			       fact =fact*n;
				n--;
			
			   }
				System.out.println( "value of n "+fact);
				
			

			int fac=1;
			while(r>=1)//3,2
			{
			  fac =fac*r;//3*1=3 ,2*3,
			 r--;//2,1
			  
			}
			 System.out.println("value of r "+fac);
			 	

		   int a =1;
			while(f>=1)
			{ a= a*f;
			  f--;
			}
			System.out.println("n-r is "+ a);
			
			 double di =fact/(fac*a);
				System.out.println( "ncr of is "+di);
		      }

		
		
		
}

}

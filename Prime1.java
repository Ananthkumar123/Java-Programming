//1 to 100 prime numbers
public class Prime1 {

	public static void main(String[] args) {
		      
		 		for(int num=1;num<100;num++)
		 		{	
		 			
		 		    int count =0;
		 		    for(int start=2; start<=num/2;start++)
		 		   {
		 			     if(num%start==0)
		 			     {
		 		            count++; // count ==2 ,it is prime 
		 		             break;
		 			      }
		 		   }
		 	
		 		
		 		if(count==0 && num!=1 && num>0)
		 			System.out.println("it is a prime number"+num);
		 		

		 		}
	}

}

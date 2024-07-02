// num = 234 
//4! factorial is 24
//3! factorial is 6
//2  factoiral is 2
public class Extractiondigit {

	public static void main(String[] args) {
		    
		int sum=0; 
		int temp;
		int x=0;
	for(int num=234; num>0; num/=10)
		{
		
			int rem =num%10;
			temp = rem;//24,
			 
			int fact=1;
		    for( ;temp>1;temp--)	
		      { 
		    	  sum=0;
		    	fact= fact*temp;//
		    	sum =sum + fact;//24+6+2
		      }
		        x=x+sum;
		        
			    System.out.println(temp+"factorial is"+fact );
			    System.out.println(" sum is "+x);
//			     System.out.println(num);
//			    System.out.println("rem "+ rem);
 		}
	
	
	

	}

}

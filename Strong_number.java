// num = 145 = 5! + 4!+ 1 = 120 +24+1 =145 :strong number 
public class Strong_number {

	public static void main(String[] args) { 
		int num=145;
		int temp1=num;
		int x=0;
		int sum=0;
		for(;num>0;num/=10)
		{
			int rem = num%10;
			int temp = rem;
			int fact = 1;
			   sum=0;
			for(;temp>=1;temp--)
			{
				fact = fact*temp;//120
				
			}
			sum =sum+fact;//120+0=120,
			x= x+sum; 
			
			}
		System.out.println("sum is"+x);
		System.out.println(temp1==x? sum+"it s a strong number":"not a strong  ");

		
		
	}
	
}
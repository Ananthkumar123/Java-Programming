
		
public class Main {
	public static void main(String arg[]) {
		 
		for(int y=1;y<150;y++)
		{
			int num =y;
			int sum =0;
			for(;num>0;num/=10)
			{
				int rem = num%10;	
				
				int x = rem;
				int fact =1;
				
				for(;x>=2;x--)
				{
					fact = fact*x;	
				}
				   sum=sum+fact;
				
			 	 
			 }
			System.out.println(sum==y?sum+"strong":"not a arms");
		}
	}

}
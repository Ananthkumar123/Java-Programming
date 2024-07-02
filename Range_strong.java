//  strong = 145  1 --100000
public class Range_strong
{

	public static void main(String[] args) 
	{
		 
		 for(int num=1;num<150;num++)//1 1
		 {
		 int sum =0;
		 int temp =num;//1
		 
		 for(;temp>0;temp/=10)// 1  0 
		 {
			 int rem =temp%10;//1
			 int fact =1;
			 
			   for(;rem>=1;rem--)//1
			   {
				   fact = fact*rem;//24
				   
			   }
			   sum = sum+fact; //1
			   
			   //System.out.println(fact);
			  
		 }
		
		 System.out.print((num == sum )?num +", ":"");
		 }
	}	

}

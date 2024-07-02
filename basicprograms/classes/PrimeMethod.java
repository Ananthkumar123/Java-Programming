package basicprograms.classes;
import java.util.Scanner;
public class PrimeMethod {

	public static void main(String[] args) {
		 
		 
		caluculation p1 = new caluculation();
		Scanner s= new Scanner(System.in);
		 System.out.println("enter a number");
		 p1.num = s.nextInt();
		System.out.println(p1.prime());
		System.out.println(p1.Polindrome());
		 
	}

}

class caluculation
{ 
	int num,count=0,start=0,temp=num;;
	String prime()
	{
		for( start=2;start<=num/2;start++)
		{
		 if(num%start==0)
		 {
			 count++;
			 break;
		 }
		}
		if(count==0)
		  {
			return "it is a prime";
		  }
		else
		  {
			return "not a prime ";
		  }
			
	}
	  //num=temp;
	 String Polindrome()
	 {
		 num=temp;int rev=0;
		 for(;num>0;num/=10)
		 {
			int rem = num%10;
			rev = rev*10+rem;
		 }
		 num=temp;
		  if(rev==num)
			  return"  polindrome ";
		  else
			  return "it is not polindrome";
	 }
	
}

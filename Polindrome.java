//reverse a number 1551
public class Polindrome {

	public static void main(String[] args) {
			
		int num = 1551,temp= num,rev=0;
		for(;num>0;num/=10)
		{
			int rem =num %10;
			 rev = rev*10+rem;
			
		}
		 System .out.println(rev==temp? "it is polindrome ":"its not reversed");
		
	}

}

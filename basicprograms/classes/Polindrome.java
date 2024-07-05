package basicprograms.classes;

 

public class Polindrome {

	public static void main(String[] args) 
	{
		 Myclass ak =new Myclass();
		  ak.polindrome(121,121,0);
		

	}

}
class Myclass
{
	
	
	void polindrome(int num,int temp,int rev )
	{   
	 
		  
		 if (num==0) //12!=0
		 {
		  if(temp==rev)
			 System.out.println("it is polindrome"+rev);
		 }
		 else
		 {
			 int rem =num%10;//121%10 =1,12%10=2
			 rev = rev*10+rem;//1 ,2,1
			 num = num/10; //12,1
			 polindrome (num,temp,rev);//12,121 1,121
			// System.out.println(rev);  
		 }
		
	}
	
}
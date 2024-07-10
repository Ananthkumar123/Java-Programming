package com.basicprograms.arrays;

public class ArraypolindromeMethod {

	public static void main(String[] args) 
	{
		 
		Myclass s=new Myclass();
		int ar[] = {121,45,141,5458,456,151};
		
		for(int i=0;i<ar.length;i++)
			System.out.println(s.Polindrome(ar[i]));
		
	}

}

class Myclass
{
	String Polindrome(int a)
	{   
			int rev=0;
			int rem=0,temp=a;
			for(;temp>0;temp/=10)
			{
			 rem = temp%10;
			 rev = rev*10+rem;	
			}
			return (rev == a ? a+" it is polindrome":a+" it is not apolindrome");
	}
}

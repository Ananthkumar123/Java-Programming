package com.basicprograms.arrays;

public class PrimeMethodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myrom s = new Myrom();
		 int ar[] = {121,5,141,5458,456,151};
		 
		 for(int i=0;i<ar.length;i++)
			 System.out.println(s.Prime(ar[i]));
	}

}
class Myrom
{
	String Prime (int a)
	
	{   int count=0;
		for(int start=1;start<a;start++)
		{
			if(a%start==0)
			{
				count++;
				 
			}
		}
		return count==1 ? a+" it s prime":a+" its not a prime";
		  

			
	}
}

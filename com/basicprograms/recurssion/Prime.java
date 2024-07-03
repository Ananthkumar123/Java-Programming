package com.basicprograms.recurssion;

public class Prime {

	public static void main(String Args[])
	{
		ch20 ak =new ch20();
		for(int x=1;x<=20;x++) //for 20 numbers
		 ak.prime(x, 1, 0); 
			//single number ak.prime( 13,1,0)
	}
	
}
class ch20
{
	void prime(int num,int start,int count)
	{
		if(start==num+1)
		{ 
			if(count==2)
				System.out.println("it is a prime :"+num);
		}
		else
		{
			 if(num%start==0)
			 {
				count++; 
			 }
			 prime(num,start+1,count); //start want increase the value to check num 
				 
		}
	}
}
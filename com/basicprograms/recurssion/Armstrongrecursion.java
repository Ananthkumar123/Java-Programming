package com.basicprograms.recurssion;

public class Armstrongrecursion 
{

	public static void main(String[] args)
	{
		 Myclass ak =new Myclass();
		 ak.armstrong(153, 0);

	}

}

class Myclass
{
	void armstrong(int num, int sum )
	{  
		if(sum==num)
		{
			System.out.println("it armstrong");
		}
		else 
		{
			 if(num>0)
			 {
				 int rem= num%10;
				   //count ++;
				  num = num/10;
				  int pow =(int)Math.pow(rem,3);
				  sum+=pow;
				  armstrong(num,sum);
				  
			 }
		 
		  
		  
		}
 
	}

}

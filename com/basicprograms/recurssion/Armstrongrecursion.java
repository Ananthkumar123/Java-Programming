package com.basicprograms.recurssion;

public class Armstrongrecursion 
{

	public static void main(String[] args)
	{
		 Myclass ak =new Myclass();
		 ak.armstrong(153, 0,153,ak.digits(153,0));

	}

}

class Myclass
{
	int digits(int num, int count )
	{  
		  if(num==0)
		  {
			  return count;
		  }
		  else
		  {
			  count++;
			  System.out.println("");
			return  digits(num/10,count);
		  }
	}
	void armstrong(int num , int sum ,int x,int count)
	{
		if(num ==0)
		{
			if (x==sum)
				System.out.println("armstrong "+sum);
			else
				System.out.println( );
		}
		else
		{
			int rem =num%10;
			sum =sum+(int) Math.pow(rem,count);
			armstrong(num/10,sum,x,count);
		}
	}
	

}

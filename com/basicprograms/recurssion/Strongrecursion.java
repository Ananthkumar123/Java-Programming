package com.basicprograms.recurssion;

public class Strongrecursion {

	public static void main(String[] args) {
		myclas	ak=new myclas();
		ak.Strong(145, 1,0,145);
 
	}

}
class myclas
{
	void Strong(int num,int fact,int sum,int temp1)
	{ 	
		 
		for(;num>0;num/=10)
		{
			int rem = num%10;
			int temp = rem;
			 
			   fact=1;
			for(;temp>=1;temp--)
			{
				fact = fact*temp;//120
				
			}
			sum =sum+fact;//120+0=120,
			
			}
		 System.out.println(sum==temp1?"it is a armstrong ":"it is not aarmstrong");
		
	}

}

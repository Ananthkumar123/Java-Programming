package com.basicprograms.recurssion;



public class Strongrecursion {

	public static void main(String[] args) {
		myclas	ak=new myclas();
		ak.Strong(145, 1,0);
 
	}

}

class myclas
{
	void Strong(int num,int fact,int sum)
	{ 	
		 
		for(;num>0;num/=10)
		{
			int rem = num%10;
			int temp = rem;
			 
			   sum=0;
			for(;temp>=1;temp--)
			{
				fact = fact*temp;//120
				
			}
			sum =sum+fact;//120+0=120,
			 System.out.println(sum); 
			
			}
		
	}

}

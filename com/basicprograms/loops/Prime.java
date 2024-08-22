package com.basicprograms.loops;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x =1;x<=100;x++)
		{
			int num =x,count=0;
			for(int start=2;start<num/2;start++)
			{
				if(num%start==0)
				{
					count++;
				}
				
			}	
				if(count<1)
				System.out.println("it is a prime "+num);
		}

	}

}

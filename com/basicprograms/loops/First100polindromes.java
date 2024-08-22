package com.basicprograms.loops;

public class First100polindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x =1;x<=100;x++)
		{
			int num=x,rev=0;
			int temp =num;
			for(;num>0;num/=10)
			{
				int t = num%10;
				rev = rev*10+t;
				
			}
			if(rev==temp)
				System.out.println("it is a polindrom"+rev);
			
		}

	}

}

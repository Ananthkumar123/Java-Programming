package com.basicprograms.loops;
import java.util.Scanner;
public class Armstrong_for {

	public static void main(String[] args) {
	 
		for(int a =1;a<30;a++)
		{ 
			int num = a;
			
			int count=0,x=num,sq=0,sum =0;
			for(;num>0;num/=10)
			{
				int rem = num%10;
				count++;
			}
				num =x;
				for(;num>0;num/=10)
				{
					int rem = num%10;
					sq = (int)Math.pow(rem,count);
					sum = sum+sq;
					//System.out.println(rem+"power is"+sq);
				}
		
		//System.out.println(sum);
		
		System.out.println(x==sum ? x+ " it is armstrong":x+" its not a armstrong");
		
		}
	}
  
}

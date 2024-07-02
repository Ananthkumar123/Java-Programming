package com.basicprograms.nestedloops;
import java.util.Scanner;
//prime using nested upto 1-100
public class Prime {
	public static void main(String arg[])
	{
		 Scanner ak =new Scanner(System.in);
		 System.out.println("enter a number");
		 int num = ak.nextInt();
		    int count1=0;
			for(int y=2;y<=num;y++)
			{
				int count=0;
				for(int x=2;x<=y/2;x++)
				{
					if(y%x==0)
					{
						count ++;
						break;
					}
		
				}
		
		
			if(count==0)
			{		
			System.out.println("it is a prime number "+y);
				count1++;
			
			if(count1==10) {
				System.out.println("firsr 10 prime s");
				break;
			}
		}
	  }		
	}
}
 
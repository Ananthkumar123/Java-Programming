package com.basicprograms.loops;
//first 15 polindromes
public class Palindrome {

	public static void main(String[] args) {
		for(int temp=1;temp<=100;temp++)
		{
			int num =temp,count=0;
		
		 int rev=0,tem=num;
		 for(;num>0;num/=10)
		 {
			 int rem = num%10;
			    rev= rem+rev*10;
		 }
		  if(rev == tem) {
			  System.out.println("polindrome"+temp);
			  count++;
			   
		   }
		  if(count==15)
			   System.out.println("first numbers"+count);
		}
	}

}

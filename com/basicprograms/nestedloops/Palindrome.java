package com.basicprograms.nestedloops;

public class Palindrome 
{
		public static void main(String[] args) {
	      int num =143,x= num ,rev=0;
	      
	      for(;num>0;num/=10)
	      {
	    	  int rem = num%10;
	    	  rev = rev*10+rem;
	    	   
	      }
	   System.out.println(x==rev ?x+" Polindrome":" not a palindrome ");
		}

	}

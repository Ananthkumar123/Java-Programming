package com.basicprograms.nestedloops;
import java .util.Scanner;
public class Exam {

	public static void main(String[] args)
	{ 
		Scanner s=new Scanner(System.in);
				 System.out.println("enter a number");
			 	 int num =s.nextInt();
			 	  for(int x=1;x<=num;x++)
			 	  {   
			 		  int sum =0,sq=0;
			 		   num =x;
			         for(;num>0;num/=100)
			         {
			        	 int rem = num%100;
			        	 sum+= rem;
				      }
			       //  System.out.println(sum);
				    sq =(int)Math.pow(sum,2);
				   
				 //   System.out.println(sq);
				    if(sq==x)
				    System.out.println("it is technology number"+x);
				 
			   }
			  
		 

			}

	}





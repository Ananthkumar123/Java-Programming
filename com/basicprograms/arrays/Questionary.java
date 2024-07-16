package com.basicprograms.arrays;
import java.util.Scanner;
public class Questionary {

	public static void main(String[] args) {
		 
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter the length ofa array");
//		int Size = s.nextInt();
//		
//		String a[]= new String[Size];
//		char c[] =new char[Size];
//		int n[]= new int[Size];
//		//boolean[]b=new boolean[Size];
//		for(int x=0;x<a.length;x++)
//		{
//			//System.out.println("enter a element");
//			//b[x]=s.nextBoolean();
//		  a[x] =s.next();
//		 
//		}
//		
//		for(String t:a)
//			System.out.print(t+",");
//		
		//finding lengths without using length method
//		int count=0;
//		 int []a =new int[] {10,50,45,60};
//		 
//		 for(int t:a)
//		 {
//			 count++;
//		 }
//		 System.out.println(count+" the length of an array is");
		
 
		//swap the adjusent elememts
	int c[]=new int[] {12,56,34,23,76,32,75,90} ;
	 
	if(c.length%2==0)
	{
	 int d[]=new int[c.length];
     int f[]=new int[c.length];
     
     for(int x=0,y=0;x<c.length;x++,y++)
	  {
		  if(c[x]%4==0)
		  {
			  d[y]=c[x];
				 
		  }
		  
	   } 
     for(int t:d)
		 System.out.print(t+",");
     }
	else
	{
		 int d[]=new int[c.length/2];
		 int f[]=new int[c.length/2];
	}
    //printing the array in ascending order
	 
	  for(int x=0;x<c.length-1;x++) {
		  if(c[x]>c[x+1])
		  {
			  int temp =c[x];
			  c[x] =c[x+1];
			  c[x+1] =temp;
			  x=-1;
		  }
	  }
	  for(int r:c)
		  System.out.println(r);
	  
	}	 
}


package com.basicprograms.arrays;

import java.util.Arrays;
// finding duplicates and print 	
public class DuplicatePrac {

	 public static void main(String args[])
	 {
		 int a[] = {56,1,5,45,10,85,5,1};
		 
		 System.out.println("sorted array ");
	 
		 for(int x=0;x<a.length-1;x++)
		 {
			  if(a[x]>a[x+1])
			  {
				  int t=a[x];//
				  a[x] =a[x+1];//
				  a[x+1] =t;//
				   x=-1;//
						  
			 }
		 }
		 for(int t:a)
			 System.out.print(t+",");
		 
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 
		 int b[] = new int[a.length];
		 for(int x=0;x<a.length-1;x++)
		 {
			 int count=1;
			 for(int y=x+1;y<a.length-1;y++)
			 {
				 if (b[x]==1)
					 continue;
				 if(a[x]==a[y])
				 {
					 
					 b[y]=1;
					 count++;
				 }
				 
			 }
			 if(count>1)
				 System.out.println (a[x]+","+count );
		 }
		 
	 }

}

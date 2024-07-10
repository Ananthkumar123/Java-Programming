package com.basicprograms.arrays;

import java.util.Arrays;
// finding duplicates and print 	
public class DuplicatePrac {

	public static void main(String[] args) {
		 int a[] = new int[] {10,8,25,60,10,4,10,25,8,6,10};
		 int b[] = new int[a.length];
		 
		 System.out.println("sorted array is ");
		 Arrays.sort(a);
		 for(int t:a)
		 System.out.print(t+" ");
		 
		 int count=0,k=0;
		 for(int x=0;x<a.length-2;x++)
		 { 
			 
			 if(a[x]==a[x+1])
			 {
				 count++;
				 
			 }
		 }
		 if(k<count)
		 {
			 k=count;
		 }
		 if(count>0)
		 {
			 System.out.println();
		 }
		  
			 
		// System.out.println("\n"+count);
		 
		 
	}

}

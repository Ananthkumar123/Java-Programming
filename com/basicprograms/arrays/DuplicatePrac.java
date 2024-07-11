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
		 
		 int count=1;
		  for(int x=0;x<a.length;x++)
		  {
			  if(b[x]==1)
			  continue;
			  count=1;
			  for(int y=x+1;y<a.length;y++)
			  {
				  if(a[x]==a[y])
				  {
					  b[y]=1;
					  count++;
				  }
				  
			  }
			  if(count>1)
			  System.out.println(a[x]+" duplicates "+count);
		  }
 
	}

}

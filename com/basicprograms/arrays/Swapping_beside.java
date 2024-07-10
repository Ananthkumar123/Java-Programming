package com.basicprograms.arrays;

public class Swapping_beside {

	public static void main(String[] args) {
		 int a[] = {10,20,30,40,50,60,70};
		 for(int x=0;x<a.length-1;x++)
		 {
			 if(x%2==0)
			 {
				 int temp =a[x];
				 a[x]=a[x+1];
				 a[x+1]=temp;
				 
			 }
			  
 			   
		 }
		
			 int tep=a[a.length-1];
			 a[a.length-1]=a[a.length-2];
			 a[a.length-2]=tep;
			 
			 
		 
		 
		 for(int t:a)
			 System.out.print(t+" ");
	}

}

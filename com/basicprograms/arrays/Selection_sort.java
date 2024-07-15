package com.basicprograms.arrays;

public class Selection_sort {

	public static void main(String[] args) {
		//  selction sort
		int a[] = {9,5,8,3,2,7};
		
		
		 for(int x =0;x<a.length-1;x++)
		 {
			 int min =x;  
			 for(int y=x+1;y<a.length;y++)
			 {
				 if(a[min]>a[y])
				 {
					 min =y;
				 }
			 }
		 
		 int t= a[x];
		 a[x]=a[min];
		 a[min]=t;
		 
		 }
		 for(int t:a)
			 System.out.println(t);
	}

}

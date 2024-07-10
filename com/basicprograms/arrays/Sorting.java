package com.basicprograms.arrays;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		
		int a[] = {50,30,40,5,10,20};
		int b[] = new int [a.length];
		
		for(int x=0;x<a.length-1;x++)
		{
			 
				if(a[x]>a[x+1]) //ascending order
				{
					int t =a[x];
					a[x]=a[x+1];
					a[x+1]=t;
					 x=-1;
					 
					
				}
			
		}
		 for(int t:a) //for each loop to fetch the elements of a array
		 {
			 System.out.println(t);
		 }
		 	
		 
		 Arrays.sort(a); //by using algoritm 
		 for (int t:a)
			 System.out.print(" "+t);
	}

}

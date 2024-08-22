package com.basicprograms.arrays;

import java.util.Scanner;

public class ScannerSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[6];
		Scanner s= new Scanner(System.in);
		System.out.println("enter arrays ");
		for(int e=0;e<arr.length;e++)
		{
			arr[e]=s.nextInt();
		}
 		
		 for(int x=0;x<arr.length-1;x++)
		 {
			 if(arr[x]>arr[x+1])
			 {
				 int t = arr[x];
				 arr[x]=arr[x+1];
				 arr[x+1] =t;
				 x=-1;
				 	
			 }
			 
		 }
		 for(int t :arr)
			 System.out.println(t);
	}

}

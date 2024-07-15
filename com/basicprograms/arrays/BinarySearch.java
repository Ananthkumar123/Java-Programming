package com.basicprograms.arrays;

import java.util.Arrays;

import jdk.incubator.vector.VectorOperators.Binary;

public class BinarySearch {

	public static void main(String[] args) {
		//  by using algorithm and sorting 
		int a[] = new int [] {10,8,25,60,10,4,10,25,8,6,10};
		System.out.println("soreted aryy is ");
		Arrays.sort(a);
		for(int t:a)
			System.out.print(" "+t);
		
	/*	int search =10  ,f=0,l=a.length-1,m=(f+l)/2;
		for(int x=0;x<=a.length-1;x++)
		{
		
		}
		while(f<=l)
			{ m=(f+l)/2;
		
			if(search==a[m])
			{
				System.out.println("\n element found "+m);
			 	break;
			}
			else if(search>a[m])
			{
				f=m+1;
			}
			else if(search<a[m])
			{
				l=m-1;
			}
			
		 }
		
			if(f>l)
				System.out.println("\nelement not found");
			
			*/
		
		 
		int res =Arrays.binarySearch(a, 26); //pre defined method
		
		//System.out.println(res);
		
		if(res>=0)
			System.out.println(res);
		else
			System.out.println("\nelement not found"+res);

	}

}

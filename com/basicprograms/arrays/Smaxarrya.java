package com.basicprograms.arrays;

import java.util.Arrays;

public class Smaxarrya {

	public static void main(String[] args) {
	 
		int a[] = new int[] {  10,8,25,60,10,4,10,25,8,6,10};
		
		Arrays.sort(a);
		System.out.println("sorted array ");
		for(int t:a)
		System.out.print(" "+t);
		
		int max= a.length-1,smax=0;
		for(int x=a.length-2;x>=0;x--)
		{
			if(max!=a[x])
			{
				 smax=a[x];
				 break;
			}
		}
		System.out.println("the second max is "+smax);

	}

}

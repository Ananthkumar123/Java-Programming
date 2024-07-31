package com.basicprograms.arrays;

import java.util.Arrays;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {1,5,10,80,10,25,25,5,25,3};
		//boolean b[] = new boolean[a.length];
	    int b[] = new int[a.length];
		for(int x=0;x<a.length-1;x++)
		{
			int count=1;
			if(b[x]==1)
				continue;
			for(int y=x+1;y<a.length;y++)//
			{
				if(a[x]==a[y])
				{
					b[y]=1;
					count++;
				}
			}
			if(count>1)
			{
				System.out.println("duplicates are"+a[x]);
			 System.out.println();
			    System.out.println("repting "+count+"times   element is " +a[x]);
			}
		}
		
	   
		
	}

}

package com.basicprograms.arrays;

import java.util.Arrays;

public class Indexes {

	public static void main(String[] args) {
		// print one half even  indexes and second half odd 
		int a[] ={1,20,5,10,191,8,81};
		int d[] =new int [a.length];
		
		for( int x=0,y=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				d[y]=a[x];
			 y++;
			}	 
		}
		for(int y=0;y<a.length/2;y++)
		{
			if(a[y]>a[y+1])
			{
				int temp =a[y];
				a[y] =a[y+1];
				a[y+1]=temp;
			}
			}
			for(int z:a)
			System.out.println(z);
		for( int x=0,y=(a.length/2)+1;x<a.length;x++)
		{
			if(x%2!=0)
			{
				d[y]=a[x];
			 y++;
			  
			}
		}
		
		
//		for(int r:d)
//			System.out.print(r+",");
//		System.out.println();
//		
		 
		
		 		

	}

}



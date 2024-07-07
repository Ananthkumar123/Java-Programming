package com.basicprograms.arrays;

public class Sorting {

	public static void main(String[] args) {
		
		int a[] = {50,30,40,5,10,20};
		
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]>a[y])
				{
					int t =a[x];
					a[x]=a[y];
					a[y]=t;
					
				}
			}
		}
		 for(int t:a) //for each loop to fetch the elements of a array
		 {
			 System.out.println(t);
		 }

	}

}

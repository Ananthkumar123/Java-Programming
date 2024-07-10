package com.basicprograms.arrays;

public class Decendingarray {

	public static void main(String[] args) {
		 
		int a[]= new int[] {10,20,30,40,50,60};
		
	for(int x=0;x<=a.length-1;x++)
	{
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[x]<a[y])
			{
				int t =a[x];
				a[x]=a[y];
				a[y]=t;
			}
		}
	} System.out.println("soreted aryy is ");
	for(int t:a)
		System.out.print(" "+t);
	
	   int search= 40;
	   

	}

}

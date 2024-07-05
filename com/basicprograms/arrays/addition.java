package com.basicprograms.arrays;

public class addition {

	public static void main(String[] args) {
		
		int k =6;
		int a[]= {1,5,4,6,7,2,3};
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a.length-1;y++)
			{
				if(a[x]+a[y]==k)
				{
					System.out.println(a[x]+","+a[y]);
				}
				
					
			}
		}

	}

}

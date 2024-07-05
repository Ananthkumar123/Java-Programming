package com.basicprograms.arrays;

public class Comparing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40};
		int b[] = {10,20,30,50};
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=b.length-1;y++)
			{
				if(a[x]==b[y])
					
					System.out.println(a[x]+" zz"+b[y]);
				else
					System.out.println(a[x]+"different"+b[y]);
			}
			
		}
	}

}

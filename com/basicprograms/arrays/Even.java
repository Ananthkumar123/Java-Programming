package com.basicprograms.arrays;
//print even numbers and even indexes
public class Even {

	public static void main(String[] args) {
		 
		int a[]= {9,1,3,4,8,6,7};
		System.out.println("even index elements");
		for(int x=a.length-1;x>=0;x--)
		{
			if(x%2==0)  //even  index elements
			System.out.println(a[x]);
		}
		for(int y=1;y<=a.length-1;y++)
		{
			if(a[y]%2==0)
				System.out.println("even elements are "+a[y]);
		}
        
	}

	}


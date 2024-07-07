package com.basicprograms.arrays;

public class Breakingadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,15,12,56,45,32,9};
		int count =0,count1=0;
		for(int x=0,y=0;x<=a.length-1;x++)
		{
			if(a[x]%2==0)
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		int b[]= new int[count];
		int c[]= new int[count1];
		
		for(int x=0,y=0,z=0;x<a.length;x++)   
		{
			if(a[x]%2==0)
			{
				b[y]=a[x];
				y++;
			}
			else
			{
				c[z]=a[x];
				z++;
			}
		}
		System.out.println("even element array");
		for(int t:b)
		{
			System.out.print(t+" ");
		}
		System.out.println("\nodd element array");
		for(int t:c)
		{
			System.out.print(t+" ");
		}
	}

}

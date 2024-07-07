package com.basicprograms.arrays;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={1,5,20,10,19,12,8};
		
		int count1=0; 
		for(int x=0;x<a.length;x++)
		{
			int count=0;
			for(int start=2;start<=a[x];start++)
			{
				if(a[x]%start==0)
				{
					count++;
				}
			}
			
			if(count==1||a[x]==1)//
			{
				 count1++;
			}

		}
		int[] b = new int[count1];
		for(int x=0,y=0;x<a.length;x++)
		{
			int count=0;
			for(int start=2;start<=a[x];start++)
			{
				if(a[x]%start==0)
				{
					count++;
				}
			}
			
			if(count==1||a[x]==1)
			{
				 b[y]=a[x];
				 y++;
			}

		}
		System.out.println("Prime numbered array is");
		
		for (int t:b)
		{
			System.out.print(t+" ");
		}
		

	}

}

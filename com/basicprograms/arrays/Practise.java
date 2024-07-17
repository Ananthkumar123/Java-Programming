package com.basicprograms.arrays;

public class Practise {

	public static void main(String[] args) {
		// divide into half and first half is ascending and another desecnding 
		int a[] ={1,20,5,10,191,8,81};
		int b[] =new int[a.length]; //odd indexs
		int c[] = new int[a.length-b.length] ;//even i
		
		System.out.println("even indexes and odd indexes");
		
		for( int x=0,y=0;x<(a.length);x++)
		{
			if(x%2==0)
				
			{
				b[y]=a[x];
			 y++;
			}
		}
			
		 for(int x=0,y=(a.length/2)+1;x<a.length;x++)
		 {
				if(x%2!=0)
				{
					b[y]=a[x];
					y++;
				}
		 }
		
		for(int r:b)
			System.out.print(r+",");
		System.out.println();
		
		
		
	}
	}

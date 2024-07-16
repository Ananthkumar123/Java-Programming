package com.basicprograms.arrays;

public class Practise {

	public static void main(String[] args) {
		// divide into half and first half is ascending and another desecnding 
		int a[] ={1,20,5,10,191,8,81};
		int b[] =new int[a.length];
//		int x;
//		for( x=0;x<(a.length/2)-1;x++)
//		{
//			if(a[x]>a[x+1])
//			{
//				int t=a[x];
//				 a[x]=a[x+1];
//				 a[x+1]=t;
//				 x=-1;
//			}
//		
//		}
//		 
		for( int x=0,y=0;x<a.length;x++)
		{
			if(x%2==0)
				b[y]=a[x];
			 y++;
			 else
				 
		}
		
		for(int r:b)
			System.out.println(r);
		 		

	}

}

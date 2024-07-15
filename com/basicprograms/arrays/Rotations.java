package com.basicprograms.arrays;

public class Rotations {

	public static void main(String[] args) {
		// change the adress of 1 and 5 right rotation
		
		int[] a=new int[] {1,2,3,4,5};//34512
		
		
		
		for(int y=0;y<a.length;y++)
		{
			int temp=a[a.length-1],x;
		 for( x=a.length-1;x>0;x--) //
		 {
			 a[x] =a[x-1];// 
		 }
		 System.out.println();
		 a[x] =temp;
		 for(int t:a)
			 System.out.print(t+",");
		}
		 System.out.println();
		 
		 //left rotation
//		 int temp1=a[0],y;
//		 for( y=0;y<a.length-1;y++)
//		 {
//			 a[y] =a[y+1]; //1=2,2=3
//		 }
//		 
//		 a[y] =temp1;
//		 for(int t:a)
//			 System.out.print(t+",");

	}

}

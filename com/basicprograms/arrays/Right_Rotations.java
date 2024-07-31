package com.basicprograms.arrays;

public class Right_Rotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,10,20,30,40,50,60,70,80,90,100};
		
		int ele=47,index=4,x=0,r=3;
		for(int y=0;y<r;y++)
		{
			for( x=0;x<index;x++)
			{
				a[x]=a[x+1];
			}
			a[x]=ele;
		}
			for(int t :a)
				System.out.println(t+",");
		}

}

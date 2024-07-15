package com.basicprograms.arrays;

public class Insertion {

	public static void main(String[] args) {
		//insertion 
		
		int a[] =new int[] {10,20,40,50,60,70,0};
		int index=5,element=65,x;
		for( x=a.length-1;x>index;x--)//7;7>5,6>5
		{
			a[x]=a[x-1]; //70=0,
		}
		a[x]=element;
		for(int t :a)
			System.out.println(t);
	}

}

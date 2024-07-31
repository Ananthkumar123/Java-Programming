package com.basicprograms.arrays;

import java.util.Arrays;

public class Questio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int a[]=new int[] {10,20,40,7,5,8,7,9,8};
		int b[] =new int[(a.length/2)+1];//for odd indexes
		
		for(int x=0,y=0;x<(a.length);x++)
		{
			if(x%2==0)
			{
				b[y]=a[x];
				y++;
			}	
		}
		for(int t:b)
			System.out.println(t);
		System.out.println("______");
		me Me =new me();
		Me.ar();
	}

}
//Write a program to print all the even indexed elements in ascending order and
//odd indexed elements in descending order
 
class me{
		
	int d[]=new int[] {10,20,40,7,5,8,7,9,8};
	int c[] =new int[d.length]; //for odd indexes
	void ar() {
		
		for(int x=0,y=0;x<d.length;x++)
		{
		  if(x%2==0)	
		  {
			  c[y]=d[x];
			  y++;
		  }
		  else 
			  
			  c[y]=d[x];    
		       
		}
		 
		for(int t:c)
			System.out.println(t);
		
	}
	
}
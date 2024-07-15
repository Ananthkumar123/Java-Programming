package com.basicprograms.arrays;
import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int b[]= new int[a.length/2];
		int c[] = new int[a.length/2];
		int d[] = new int[a.length];
		System.out.println("b array");
		for(int x=0;x<a.length/2;x++)
		{
			b[x]=a[x];
			System.out.println(b[x]);
		}
		
		System.out.println("c arry");		
		for(int x=a.length/2,y=0;y<=b.length-1;x++,y++)
		{
			c[y]=a[x];
			System.out.print(c[y]+",");
			
     	}
		 System.out.println();
		 
		 for(int x=0,y=c.length-1;x<a.length;x++)
		 {
			 if(x<b.length)
			 {
				 d[x] =b[x];
			 }
			 else 
			 { 
				  d[x]=c[y];
				  y--;
			 }
		 }
		 
		for(int t :d)
			System.out.print(t+" ");
		
	

	}

}

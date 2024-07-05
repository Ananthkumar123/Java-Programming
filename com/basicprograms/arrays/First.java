package com.basicprograms.arrays;
import java .util.Scanner;
public class First {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of an array");
		int Size =s.nextInt();
		
		int ele[] = new int[Size];
		
		System.out.println("enter "+(ele.length-1)+"index values");
		 for(int x=0;x<=ele.length-1;x++)
		 {
			 ele[x] = s.nextInt();
		 }
		 
		 
		 for(int x=0;x<=ele.length-1;x++)
		 {
			 System.out.println(ele[x]);
		 }
		 
		 
		
		
	}

}

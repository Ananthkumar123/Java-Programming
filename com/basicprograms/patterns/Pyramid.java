package com.basicprograms.patterns;

public class Pyramid {

	public static void main(String[] args) {
		 int rows =5;
		 for(int r =1;r<=rows;r++)
		 {
			 for( int c=rows;c>=r;c--)
			 {
				 System.out.print(" ");
			 }
			 for(int z=1;z<=r;z++)
			 {
				//if (z==1||) 
				 System.out.print(" *");
			 }
				 
			 System.out.println();
		 }
		// System.out.println("---------------");
		 
		 for(int r =2;r<=rows;r++)
		 {
			 for(int c=1;c<=r;c++)
			 {
				 System.out.print(" ");
			 }
			 for(int z=rows;z>=r;z--)
			 {
				 System.out.print(" *");
			 }
				 
			 System.out.println();
		 }
		 

	}

}

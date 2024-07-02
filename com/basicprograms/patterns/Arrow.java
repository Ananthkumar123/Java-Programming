//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * *  
//* * * *  
//* * *  
//* *  
//*  
package com.basicprograms.patterns;

public class Arrow {

	public static void main(String[] args) {
		
		int rows =5;
		 for(int r=1;r<=rows;r++)//
		 {
			 for(int c=1;c<=r;c++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println("");
		 }
		 
		// reverse
		 for(int r=1;r<=rows;r++)
		 {
			 for(int c=r;c<rows;c++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println(" ");
		 }
		 
		 System.out.println("---------------");
		 for(int r=1;r<=rows;r++)
		 	{
			 for(int c=1;c<=r;c++)
			 {
				 if(c==1||c==r)
				 System.out.print("* ");
				 else
					 System.out.print("  ");
			 }
			 System.out.println();
		 	}
		 for(int r=rows;r>=2;r--)
		 	{
			 for(int c=1;c<=r-1;c++)
			 {
				 if(c==1||c==r-1)
				 System.out.print("* ");//2,4  3,3 4,2 5,1
				 else
					 System.out.print("  ");
			 }
			 System.out.println();
		 	}
	}

}

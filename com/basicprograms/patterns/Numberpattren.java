package com.basicprograms.patterns;
//1 
//1 2 
//1 2 3 
//1 2 3 4
//1 2 3 4 5
public class Numberpattren {

	public static void main(String[] args) {
		 int rows =5;
		 for(int r=1;r<=rows;r++)
		 {
			 for(int c=1;c<=r;c++)
			 {
				 System.out.print(c+" ");
			 }
			 System.out.println("");
		 }
		 System.out.println("           ");
		 for(int r=1;r<=rows;r++)
		 {
			 for(int c=rows;c>=r;c-- )
			 {
				 System.out.print(r+" ");
			 }
			 System.out.println("");
		 }
		   
	}

}

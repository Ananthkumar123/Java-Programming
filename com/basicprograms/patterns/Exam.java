//1
//21
//321
//4321
 
package com.basicprograms.patterns;

public class Exam {

	public static void main(String[] args) {
		 
		int rows =4;
		for(int r=1;r<=rows;r++)
		{
			int a=r;
		  for(int c=1;c<=r;c++)	//1;1<=1,1;1<=2;
		  {
			  
			  System.out.print(a+" ");//1//2 1//
			  a--;
			   
		  }
		  System.out.println();
		}
		  System.out.println(" ____________");
		
		for(int r=1;r<=5;r++)
		{
		  for(int c=5;c>=r;c--)	
		  {
			   
			  System.out.print(c+" " );
			  //a++;
		  }
		  System.out.println();
		}
	}

}

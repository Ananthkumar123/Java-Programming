// * * * * *  
//* * * *  
//* * *  
//* *  
//*  
//*  
//* *  
//* * *  
//* * * *  
//* * * * *
package com.basicprograms.patterns;

public class Diagonal 
{
	public static void main(String[] args)
	{
		
	
 int rows =5;
	
	 for(int r=1;r<=rows;r++)
	 {
		  for(int c=r;c<=rows;c++) //for(int c=rows;c>=r;c--)
		 {  //if (c==1||r==rows||r==c)
			 System.out.print("* ");
		 }
		 System.out.println(" ");
	 }
	 
	 for(int r=1;r<=rows;r++)
	 {
		 for(int c=1;c<=r;c++)
		 {
			 System.out.print("* ");
		 }
		 System.out.println(" ");
	 }

	 System.out.println(" ---------------");
   // int rows =5;
     for(int r=1;r<=rows;r++)
     {
    	 for(int c=r;c<=rows;c++)
    	 {
    		 if(r==1||c==r||c==rows)
    		 System.out.print("* ");
    		 else
    			 System.out.print("  ");
    	 }
    	 System.out.println();
    	 	
     }
     
     for(int r=1;r<=rows;r++)
     {
    	 for(int c=1;c<=rows;c++)
    	 {
    		 if( c==1 ||c==r || r==rows  )//
    		 System.out.print("* ");
    		 else
    			 System.out.print("  ");
    	 }
    	 System.out.println();
    	 	
     }
     
   }
}



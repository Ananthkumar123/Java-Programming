//    &
//   &&
//  &&&
// &&&&

package com.basicprograms.patterns;

public class LR {
	public static void main(String args[])
	{
		int rows =5;
		for(int r=1;r<=rows;r++)
		{
			for (int c=rows;c>=r;c--)
			{
				System.out.print(" ");//single space is pyramid
			}
			
			for(int z=1;z<=r;z++)//1//
			{
				System.out.print("@ ");//@
			}
			System.out.println();
		}
		
		 
	}

}

//#####
//#@@@#
//#@@@#
//#@@@#
//#####

package com.basicprograms.patterns;

public class pattren1 {


	public static void main(String[] args) {
		int row=5;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=row;c++)//2
			{
				if(r==1||r==row||c==1||c==row)//
					System.out.print(" #");
				else
				 System.out.print(" @");
			}
			System.out.println(" ");
		}
		 
	}
}

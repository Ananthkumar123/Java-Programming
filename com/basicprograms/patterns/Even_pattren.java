//####
//@@@@
//####
//@@@@
package com.basicprograms.patterns;

public class Even_pattren {

	public static void main(String[] args) {
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r%2==0)
					System.out.print(" @");
				else
					System.out.print(" #");

			}
			System.out.println(" ");// for ordering
		}

	}

}

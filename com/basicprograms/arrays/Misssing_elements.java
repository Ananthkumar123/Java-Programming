package com.basicprograms.arrays;

import java.util.Arrays;

public class Misssing_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ar[]= {1,2,3,15,5,8};
		 Arrays.sort( ar);
		 for(int t:ar)
		 System.out.print(t+" ");
		 System.out.println();
		 for(int x=ar[0],y=0;x<ar[ar.length-1];x++)
		 {
			 if(ar[y]!=x)//
			 {
				 System.out.println(x);
			 }
			 else
				 y++;
		 }
	}

}

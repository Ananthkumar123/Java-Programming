package com.basicprograms.arrays;

public class Comparing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {1,2,35,54,5,8} ;
		int b[] = new int[] {1,2,35,45,5,8};
		int count=0;
		
		 if(a.length==b.length)
		 {
		 	for(int x=0;x<a.length;x++)
			{
			   if(a[x]==b[x])
			   {
				   count++;
			   }
			       
			}
		 	if(count ==a.length)
		 		System.out.println("both arrays are true");
		 	else
		 		System.out.println("arrays are not equal");
		 }		
		 else
		 		System.out.println("arrays length not equal");
	}
}



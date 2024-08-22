package com.basicprograms.strings;

public class Reverse_a_string {

	public static void main(String[] args) {
		 
		String s ="123";
//		for(int x=s.length()-1;x>=0;x--)
//		{
//			System.out.print(s.charAt(x));
//		}
//			System.out.println();
//			
//		 StringBuffer sb= new StringBuffer(s); //sb is a mutable we can add and modify reverse 
//		 
//		 sb.reverse();
//		 System.out.println(sb);
//		 
//		 sb=sb.append('a');
//		 System.out.println(sb);
		int rev = Integer.parseInt(new StringBuffer(s).reverse().toString());
		System.out.println(rev);
		
		
	}

}

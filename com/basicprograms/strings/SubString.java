package com.basicprograms.strings;

public class SubString {

	public static void main(String[] args) {
		 
		String s ="abc";
		for(int x=0;x<s.length();x++)
		{
		 for(int y=x+1;y<=s.length();y++)
		 {
			 if(s!=s.substring(x,y))
			System.out.println(s.substring(x,y));
			
		 }
		}
//		System.out.println(s.substring(0,1));
//		System.out.println(s.substring(1,2));
//		System.out.println(s.substring(2,3));
//		System.out.println(s.substring(0,2));
//		System.out.println(s.substring(1,3));
//		
			 
		
		

	}

}

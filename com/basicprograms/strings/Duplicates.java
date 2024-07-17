package com.basicprograms.strings;

public class Duplicates {

	public static void main (String args[])
	{
		String s="hello all good morning",s2="",s3="";
		
		for(int x=0;x<s.length();x++)
		{
			char c =s.charAt(x);
			if(s.indexOf(c) == s.lastIndexOf(c))
			{
				s2=s2+c; 	
			}
		}
		System.out.println("unique elemts are"+s2);
		
		System.out.println()
		;
		for(int x=0;x<s.length();x++)
		{
			char c =s.charAt(x);
			if(s.indexOf(c) != s.lastIndexOf(c))
			{
				if(s.indexOf(c)==-1)
				{
				s2=s2+c; 	
				}
			}
		}
			
		System.out.println("repeted words are "+s2);
		
		System.out.println();
		
		for(int x=0;x<s.length();x++)
		{
			char c =s.charAt(x);
			if(s.indexOf(c)==-1)
			{
				s3=s3+c; 	
			}
		}
		System.out.println("non repeted are"+s3);
		
		//by using compareTo()

		
		
	
}
}

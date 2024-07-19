package com.basicprograms.strings;

public class Duplicates {

	public static void main (String args[])
	{
		String s="hello all good morning",s2="",s3="",s4="";
		//System.out.println(s.indexOf(""));
		
		for(int x=0;x<s.length();x++)
		{
			char c =s.charAt(x);//0h,e1,l2
			if(s.indexOf(c) == s.lastIndexOf(c))//h,e,
			{
				s2=s2+c; 	//h,e
			}
		}
		System.out.println("unique elemts are "+s2);
		
		System.out.println();
		
		for(int x=0;x<s.length();x++)
		{
			char c =s.charAt(x);//l
			if(s.indexOf(c) != s.lastIndexOf(c))//fi=2,lI=3
			{
				if(s4.indexOf(c)==-1)//
				{
					s4 =s4+c;
				}
			 }
			
				 
		}
			
		System.out.println("duplicates words are "+s4);
		
		System.out.println();
		
		for(int x=0;x<s.length();x++)
		{
			char c =s.charAt(x);
			if(s3.indexOf(c)==-1)
			{
				s3=s3+c; 	
			}
		}
		System.out.println("all are "+s3);
		
		//by using compareTo()

		
		
	
}
}

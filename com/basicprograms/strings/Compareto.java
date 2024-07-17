package com.basicprograms.strings;

public class Compareto {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="hello",s1="Hello";// 
		
		 
			if(s.compareTo(s1)==0)
				System.out.println("s and s1 are are equal");
			else if(s.compareTo(s1)<0)
				System.out.println("s1 is grater than s");
			else
				System.out.println("s is grater than s1");
		 
	}

}

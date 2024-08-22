package com.basicprograms.strings;

import java.util.Arrays;

public class Compareto {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="Aello",s1="aello";// comparing the ascci values
		
		 
			if(s.compareTo(s1)==0)
				System.out.println("s and s1 are are equal");
			else if(s.compareTo(s1)<0)
				System.out.println("s1 is grater than s");
			else
				System.out.println("s is grater than s1");
		 
			String s3 = "coffe" ,s2="";
			
			for(int x =0;x<s3.length();x++)
			{
			//	char c[] =s3.toCharArray();
				if(s3.charAt(x)>='a' &&s3.charAt(x)<'z')
				{
					s2 =s2+s3.charAt(x);
				}
			}
			System.out.println(s2);
			 
			if(s2.equals(s3))
			{
				System.out.println("it is apolindrome");
			}
			 
			
	}

}
	
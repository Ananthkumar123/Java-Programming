package com.basicprograms.strings;

import java.util.Arrays;

public class Annagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="silent",s2="istenl";
		 char c[] =s1.toCharArray();
		 char d[] =s2.toCharArray();
		
		if(s1.length()==s2.length())
		{
			Arrays.sort(c);
			Arrays.sort(d);
			
			if(Arrays.equals(c, d))
			{
				System.out.println("it is a anogram");
				
			}
			else
				System.out.println("not a anagrom");
				
		}
		else
			System.out.println("length not same so not a anagrom");
	}

}

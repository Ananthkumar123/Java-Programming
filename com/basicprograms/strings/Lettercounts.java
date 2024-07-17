package com.basicprograms.strings;

public class Lettercounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String s="hello ALL @ 1323good Morning";
		int count=1,count1=1,count2=1;
		for(int x=0;x<s.length();x++)
		{
			char c = s.charAt(x);
			
			if(Character.isUpperCase(c))
				count++;
			
			else if(Character.isLowerCase(c))
				count1++;
		}
		System.out.println(count);
		System.out.println(count1);
	}

}

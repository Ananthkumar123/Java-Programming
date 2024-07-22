package com.basicprograms.strings;

public class Questionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ananth kumar tirumal asd";
		String a[]=s.split(" ");
		 
		int count =0,count1=0;
		for(int x=0;x<s.length();x++)
		{
			System.out.println(a[x]);
			count++;

			 count1 += a[x].length();
		}
		System.out.println("words count is"+count);
		System.out.println("charcters count is"+count1);
		
	}

}

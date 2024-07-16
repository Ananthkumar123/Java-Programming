package com.basicprograms.strings;

public class Reverse_and_polindrome {

	public static void main(String[] args) {
		
		String s ="a man ,aplan , @ a  canal panama";
		String s2="";
		
		for(int x=0;x<s.length();x++)
		{
			if((s.charAt(x)>='a' && s.charAt(x)<='z' )||( s.charAt(x)>='A' && s.charAt(x)<='Z'))
			{
				s2 =s2+s.charAt(x); //retriving
			}
			

		}
		System.out.println(s2);
		
		StringBuffer sb =new StringBuffer(s2);
		
		 sb.reverse();
		
		String s3 =sb.toString();
		System.out.println(s3);
		 
		if(s3.equals(s2))
			System.out.println("polindrome");
		else
			System.out.println("not polindrome");
		
	}

}

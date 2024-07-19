package com.basicprograms.strings;

import javax.xml.transform.stax.StAXSource;

public class Numeric_value {

	public static void main(String[] args) {
		//  abv1v4vu5bd9
		String s ="abv1v4vu5bd9";
		//char ar[]=s.toCharArray();
		int sum =0;
		for(int x=0;x<s.length();x++) //ar.length
		{
			char c = s.charAt(x);
		//	char c =ar[x];
			if(Character.isDigit(c))
			{
				int num =Character.getNumericValue(c);
			System.out.println(num);
			sum+=num;
			}
			
		}
		System.out.println(sum);
	}

}

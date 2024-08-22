package com.programmes.Collections;

import java.util.ArrayList;
import java.util.Comparator;

public class NaturalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[] = new String[] {"helo","Hey","ananth","Ananth"};
		ArrayList<String> a =new ArrayList<>();
		for(int x =0;x<s.length;x++)
		{
			a.add(s[x]);
		}
		a.sort(Comparator.naturalOrder());
		System.out.println(a);
		a.sort(Comparator.reverseOrder());
		System.out.println(a);

		
		
	}

}

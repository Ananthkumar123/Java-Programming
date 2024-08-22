package com.programmes.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[] = {10,20,40 ,40,70,50,30,20,55};
		
		ArrayList<Integer> al =new ArrayList<>(Arrays.asList(a));
		
		for(int x =0;x<a.length;x++)
		{
			if(al.indexOf(al.get(x))==al.lastIndexOf(al.get(x)))
			{
					System.out.println("unique elemnts are "+al.get(x));
			}
		
		}
		 
		
		
 	}

}

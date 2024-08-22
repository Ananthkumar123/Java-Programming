package com.programmes.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Rotations {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int a[] = {10,20,30,40,50,60,70};
		ArrayList<Integer> al =new ArrayList<>(Arrays.asList(9));
		for(int x =0;x<a.length;x++)
		{
			al.add(a[x]);
			
		}
		System.out.println(al);
		Collections.rotate(al, 3);//right rotation
		System.out.println(al);
		Collections.rotate(al, -3);//left rotation
		System.out.println(al);
		
		
		System.out.println("maximum ele in the array :"+Collections.max(al));
		System.out.println("minimum ele in the array :"+Collections.min(al));
		
		System.out.println(Collections.binarySearch(al,10));
		
		Set<Integer> s=new HashSet<Integer>(Arrays.asList(10,30,4,5));
		 
//		Set<Integer> s1 =Collections.singleton(45);
//		System.out.println(s1);
//		s1.add(23);
//		System.out.println(s1);
		
		List<Integer> s2 =Collections.singletonList(45);
		System.out.println(s2);
		s2.remove(0);
//		s2.add(23);
//		System.out.println(s2);
//		
	}

}

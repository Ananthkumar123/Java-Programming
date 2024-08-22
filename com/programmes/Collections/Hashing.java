package com.programmes.Collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("using hash");
		int a[] = {10,3,55,4,5,67,2,7,566,64,43,9,15};
		Set <Integer> s =new LinkedHashSet<>();
		for(int x=0;x<a.length;x++)
		{
			s.add(a[x]);
		}
		System.out.print(s+" ");
		
		System.out.println();
		System.out.println("queue using binary search");
		
		int b[] = {10,3,55,4,5,67,2,7,56,64,43,9,15};
		Queue <Integer> q = new PriorityQueue<>();
		 for(int x=0;x<b.length;x++)
		 {
			q.add(b[x]);
		 }
		 System.out.println(q);
	}

}

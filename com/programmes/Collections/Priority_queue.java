package com.programmes.Collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Priority_queue {

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue  a = new ArrayDeque(Arrays.asList(1,5,4,697,1,8));
		//a.add(null);
		a.poll();
		System.out.println(a);
		
		System.out.println(a.add(10));//true
		
		Set <Integer> s = new HashSet<>(Arrays.asList( 10,2,4,3,5,67,5,63,4,0,3,67,10));//hash table removes duplicates
		System.out.println(s);
		 
		Set <Integer> T= new TreeSet<>(Arrays.asList(10,2,4,3,5,67,5,63,4,0,3,67,10));//reverse
		System.out.println(T);
		
		Set <Integer> L = new LinkedHashSet<>(Arrays.asList( 10,2,4,3,5,67,5,63,4,0,3,67,10)); //
		System.out.println(L);
		
		ArrayDeque <Integer>  z = new ArrayDeque<>(Arrays.asList( 10,2,4,3,5,67,5,63,4,0,3,67,10));
		Iterator u =z.descendingIterator();
		
		while(u.hasNext()) {
			System.out.println(u.next());
			
		}
		
		 
 	}

}


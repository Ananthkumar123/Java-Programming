package com.programmes.Collections;

import java.util.*;
 

public class Dynamic {

	private static final String Dequeue = null;

	public static void main(String[] args) {
		 
		
		ArrayList <Integer> al=new ArrayList<>();
		 al.add(20);
		 al.add( 10);
		 al.add( 30);
		 al.add(40);
		 al.add( 50);
		// System.out.println(al);
		 
		  System.out.println("using for ");
		 for(int x =0;x<al.size();x++)
		 {
			 System.out.println(al.get(x));
		 }
		 
		 for(int t:al)
		 {
			 System.out.println(t);
		 }
		 System.out.println();
		 
		 Integer a[] ={10,54,8,4,6,82,9,47,1,23,5};		 
		 Queue<Integer> a2= new PriorityQueue<>();
		 a2.add(10);
		 a2.add(54);
		 a2.add(8);
		 a2.add(4);
		 a2.add(6);
		 a2.add(82);
		 a2.add(9);
		 a2.add(47);
		 a2.add(1);
		 a2.add(23);
		 a2.add(5);
		 
			 System.out.println(a2);
		 
		 
		 
	}

}
 
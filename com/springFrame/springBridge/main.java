package com.springFrame.springBridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Student s = new Student();
		 s.setName( "ananth");
		 s.setRoll(9);
		 s.setSection( "A");
		 System.out.println(s);
		 
		 poso_a p = new poso_a(535,"software dev","9lpa");
		 System.out.println(p);
		 
		 Both b = new Both( );
		 
		 b.setProduct( "basmathi");
		 b.setWeight( "25kg");
		 b.setPrice(1250);
		 System.out.println(b);
		 
		 Both bo = new Both("lalitha","25kg",15000);
		 System.out.println(bo);
		 
		 int brr[] = {1,2,3,4,5};
		 
 		 List<Integer> li = new ArrayList<>(Arrays.asList( 10,20,30,50));
		 Student s1 = new Student();
		 s1.setRoll(4);
		 s1.setName( "ananth");
		 s1.setSection("a");
		 
		 special sp = new special(01,"special",brr,li,s1);
		 System.out.println(sp);
		 
		 
	}

}

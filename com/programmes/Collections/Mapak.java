package com.programmes.Collections;

//import java.util.Map;
import java .util.*;

public class Mapak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,String> m =new LinkedHashMap<>();
		   // key,value
		m.put(31,"ananth");
		m.put(42,"ak");
		m.put(63,"raju");
		m.put(54,"ramu");
	
		 System.out.println(m);
		 
		 Map <Integer,String> m1 =new TreeMap<>();
			System.out.println("iam tree map");
			m1.put(1,"ananth");
			m1.put(2,"ak");
			m1.put(3,"raju");
			m1.put(4,"ramu");
			 System.out.println(m);
			 
			 Map <Integer,String> Ha =new HashMap<>();
			 System.out.println("iam Hash map");
			 
			 Ha.putAll(m);
				 System.out.println(Ha);
				 
				 System.out.println();
				 
			  Map <Integer,String> Li =new LinkedHashMap<>();
				   // key,value
				Li.put(1,"ananth");//in values u allows the duplicates
				Li.put(1,"ak"); //in keys u allows duplicates and prints updated value only
				Li.put(3,"raju");
				Li.put(4,"ramu");
				Li.put( 5, "chamu");
				Li.put( 5, "flower");
				System.out.println(Li);
				System.out.println();
				System.out.println(Li.keySet());
				System.out.println(Li.values());
				System.out.println(Li.entrySet());
				
				Set s = Li.entrySet();
				for(Object temp:s )//object means 
				{
					System.out.println(temp);
				}
				  
				 Map <String,Integer> map = new LinkedHashMap<>();
				 
				 map.put("a", 1);
				 map.put("b", 2);
				 map.put("c", 3);
				 
				 map.computeIfPresent("a", (key, value) ->  10);
				 
				 System.out.println(map);

				
		 		
		
		
		}

}



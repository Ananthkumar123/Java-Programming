package com.basicprograms.strings;

public class Practise {
	 
	public static void main(String args[]) {
		
		  String s ="aNAnth kumar";
	        String a[] = s.split(" ");
	        int count =0;
	        
	        for(int x=0;x<a.length;x++)//0 ;0<5;
	        {
	        	 System.out.println(a[x]);//aNanth
	        	for(int y=0;y<a[x].length();y++)//0;an
	        	{
	        		char c =s.charAt(x);
	        		if(Character.isUpperCase(c))
	             count++;
	        	}
	             
	        }
	        System.out.println(count);
		
	}
		 
	}



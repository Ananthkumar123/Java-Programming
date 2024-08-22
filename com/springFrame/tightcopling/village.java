package com.springFrame.tightcopling;

public class village {


	String name ="nuzendla";
	 
	String dist ="palnadu";
	String cap ="amaravathi";
	String state= "andhra";
	 
	public static void cal() {
		
		colleage c = new colleage();
		System.out.println(c.clgname());
	}
	public static void main(String args[])
	{
		cal();
		
	}
	
}

package com.basicprograms.strings;

public class Methods {

	public static void main(String[] args) {
		 String s= "hello ";
		 String s1= "hello all";//string literals 
		 
		 String s3 = new String("hello"); 
			 System.out.println(s3==s1);  //returns false due to string literal checking adress value not data 
		 
			 
			 System.out.println(s1=s1.toUpperCase());
			 System.out.println(s1=s1.toLowerCase());
			 
			 System.out.println(s1.concat("good")); //adding data last to the string
			 
			 
		 
		 
	}

}

package com.basicprograms.strings;

public class Polindrome_String {

	public static void main(String[] args) {
		//  to check a string it is polindrome or not
		
		String s= "mom";
		
		StringBuffer sb = new StringBuffer(s);
		
		
		sb.reverse();
		System.out.println(sb);
		String s3 = sb.toString(); //to converts string type 
		
		if(s.equals(s3))//we dont here to use .equals because string buffer and string are not comparable in case we use 
			//tostring method to convert int to str and sb to str; or else s.contentEquals
			System.out.println("polindrome");
		else
			System.out.println("not apolindrome");
		
		Integer x= 121;
		
		String a =x.toString();
		System.out.println(a);
		
		StringBuffer b = new StringBuffer(a);
		
		b.reverse();
		
		String c =b.toString();
		System.out.println(b);
		
		if(a.equals(c))
			System.out.println("polindrome");
		else
			System.out.println("not a polindrome");
	}

}

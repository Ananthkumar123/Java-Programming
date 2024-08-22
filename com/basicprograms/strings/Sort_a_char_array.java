package com.basicprograms.strings;

public class Sort_a_char_array {

	public static void main(String[] args) {
		// char[] c= s.toCharArray()
		//char d = s.CharAt(x) =string to char 
		
		String s="<<>>>",s2="helloworld",s3="helloworld",s4="";
		System.out.println(s.substring(0,2)+ s2+s.substring(2,5));
		 
	 
		 char c[] = s3.toCharArray();
		 
		 char r =c[0];
		 c[0] =c[s3.length()-1];
		 c[s3.length()-1] =r;
		 
		 for(char t:c)
		 System.out.print(t);
		 
		 System.out.println();
		 
		 String s5 ="";
		 for(int x=0;x<s3.length();x++)
		 {
			 char d =s3.charAt(x);
			 if(x%2!=0 && x!=s3.length()-1)
			 {
				 s5+=Character.toUpperCase(d);
			//System.out.print(Character.toUpperCase(d));
			 }
			 else
				 s5+=Character.toLowerCase(d);
			//	 System.out.print(Character.toLowerCase(d));
				 
		 }
		 System.out.println(s5);
	

	}

}

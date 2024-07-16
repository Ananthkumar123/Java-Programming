package com.basicprograms.strings;

public class ChangeLetter {

	public static void main(String[] args) {
		//  op = hElLoalL
		String s ="Hello all";
		String s1 ="";
		
		for(int x=0;x<s.length();x++)
	       {
			if(s.charAt(x)>='a' && s.charAt(x)<='z')
	    	    {   
	    		   s1= s1+(char)(s.charAt(x)-32);
	    		   
	    	    }
	    	   else if((s.charAt(x)>='A' && s.charAt(x)<='Z'))
	    	   {
	     		   s1= s1+(char)(s.charAt(x)+32);//captial to small to add 
	     		  
	     	    }
	     	  else
	     	   s1=s1+s.charAt(x);
	    	  }
	 
	       		System.out.println(s1);
	       
	}

}

package com.basicprograms.strings;

public class Change_letters {

	public static void main(String[] args) {
		// op = HeLlO AlL by using ascii and even index
       String s= "helloall";
       String s1="";
       
       for(int x=0;x<s.length();x++)
       {
    	   if(x%2==0)
    	    {
    		   if(s.charAt(x)>='a' && s.charAt(x)<='z')
    		   {	   
    		   s1= s1+(char)(s.charAt(x)-32);
    		   }
    	    }
    	   else if((s.charAt(x)>='A' && s.charAt(x)<='Z'))
    	   {
     		   s1= s1+(char)(s.charAt(x)-32);
     		  
     	    }
     	  else
     	   s1=s1+s.charAt(x);
    	  }
 
       		System.out.println(s1);
       
	}

}

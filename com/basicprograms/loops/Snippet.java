package com.basicprograms.loops;

import java.io.IOException;
import java.util.*;
class Exp
{
 public static void main(String args[])
  {
    try{
	System.out.println("before Exception");
	System.out.println(10/0);
       }
     catch(Exception a)
	{
    	 
	 System.out.println("exception occured");	
	// a.printStackTrace();
	  
	}
      finally{
       	System.out.println("final  keyword using");
	System.out.println("blocks are executing if here any errors use try catch also ");
	}
   }
 
}
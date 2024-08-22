package com.programmes.Collections;

import java.util.ArrayList;


interface ak
{
	int  ak() ;
}
class pk implements ak
{
	public int  ak() {
		return 10;
	}
}

public class Classes_returnType {

	    public pk pkget() {
	    	return new pk();
	    	
	    }
	
	public static void main(String[] args) {
		Classes_returnType c= new Classes_returnType();
		  c.pkget();
		 pk p = c.pkget();
		System.out.println( p.ak());
	
				 
		
				
		}
		 
		
		
		 
	}


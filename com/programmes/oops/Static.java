package com.programmes.oops;

public class Static {
  
	
	public static void main(String[] args) {
		 
		par p =new par();
		//System.out.println(par.x+p.y);
		 p.num();	
		 
		
	}
	 
}
class par
{  
	static int x =11 ;
    int y=10;
	
	   static void num()
	{
		System.out.println("hello");
		System.out.println(par.x);
		par p=new par();//for acsessing non static varible 
		System.out.println(par.x+p.y);
	}
}
class chil extends par
{
	
	   void nu()
	{    
		System.out.println("hi child");

	}
}
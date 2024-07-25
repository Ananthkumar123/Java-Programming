package com.programmes.oops;

public class Overridding {

	public static void main(String[] args) {
		// overridding  it must have both class method  names and return type must and should besame then only overriding occurs 
		ak Ak =new kumar();//upcasting
		Ak.m2();
		 
		
	}

}
class ak //parent class
{
       void  m1()
	{
		System.out.println("parent class");
	}

       void  m2()
	{
		System.out.println("m2 method");
	}

       void  m3()
	{
		System.out.println("m3 method");
	}
}
class kumar extends ak //child class
{
	 void m2()
	{
		System.out.println("m2 in child class updated ");
	}
	 void m4()
	 {
		 System.out.println("m4 method in child class");
	 }
}
